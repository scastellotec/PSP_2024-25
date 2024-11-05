package exercise7_soupRestaurant;

public class Restaurant {

    private int MAX_BOWLS_AVAILABLE;
    private int emptySeats;
    private int numberClientsServed;

    public Restaurant(int bowlsAvailable) {
        this.MAX_BOWLS_AVAILABLE = bowlsAvailable;
        this.emptySeats = bowlsAvailable;
        this.numberClientsServed = 0;
    }

    public synchronized void clientEnters(String nombreCliente) throws InterruptedException {
        while(emptySeats <= 0){
            System.out.println(nombreCliente + " waiting");
            wait();
        }
        emptySeats--;
        System.out.println(nombreCliente + " seats. Remaining: "+emptySeats);
    }

    public synchronized void clientLeaves(String nombreCliente){
        System.out.println(nombreCliente + " has finish and leaves");
        numberClientsServed++;

        if(numberClientsServed == MAX_BOWLS_AVAILABLE){
            System.out.println(nombreCliente + " leaves and is the last client");
            notifyAll();
        }
    }

    public synchronized void cocineroRellenaSopa() throws InterruptedException {
        while(numberClientsServed < MAX_BOWLS_AVAILABLE){
            System.out.println("Cook takes a break");
            wait();
        }
        System.out.println("Cook is cooking");
        emptySeats = MAX_BOWLS_AVAILABLE;
        numberClientsServed = 0;
        notifyAll();
    }
}
