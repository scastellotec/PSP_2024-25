package exercise7_soupRestaurant;

public class Cook implements Runnable{

    private Restaurant restaurante;

    public Cook(Restaurant restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public void run() {
        while(true){
            restaurante.cocineroRellenaSopa();
        }
    }
}
