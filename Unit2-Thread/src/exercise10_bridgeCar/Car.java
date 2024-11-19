package exercise10_bridgeCar;


public class Car implements Runnable{

    private Bridge puente;
    private int nombre;
    private boolean esNorte; /* true NORTE; false SUR */

    public Car(Bridge puente, int nombre, boolean esNorte) {
        this.puente = puente;
        this.nombre = nombre;
        this.esNorte = esNorte;
    }

    @Override
    public void run() {
        try {
            if(esNorte == true){
                puente.entraCocheNorte(nombre);
            } else {
                puente.entraCocheSur(nombre);
            }
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        puente.salirPuente(nombre);
    }
}
