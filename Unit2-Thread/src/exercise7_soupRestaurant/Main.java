package exercise7_soupRestaurant;

public class Main {
    public static void main(String[] args) {

        final int numeroClientes = 15;

        Restaurant restaurante = new Restaurant(4);
        Cook cocinero = new Cook(restaurante);
        new Thread(cocinero).start();

        for(int i=0; i < numeroClientes; i++){
            new Thread(new Client("nombre "+i,restaurante )).start();
        }
    }
}
