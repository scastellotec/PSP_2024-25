package exercise7_soupRestaurant;

public class Client implements Runnable{

    private String nombreCliente;
    private Restaurant restaurante;

    public Client(String nombreCliente, Restaurant restaurante) {
        this.nombreCliente = nombreCliente;
        this.restaurante = restaurante;
    }


    @Override
    public void run() {
        try {
            restaurante.clienteCogeCuencoSopa(nombreCliente);
            Thread.sleep(1500);
            restaurante.clienteTerminaCuencoSopa(nombreCliente);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
