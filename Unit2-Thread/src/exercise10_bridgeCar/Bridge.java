package exercise10_bridgeCar;

public class Bridge {

    private int nCochesNorte = 0;
    private int nCochesSur = 0;
    private boolean estaOcupado = false;

    /* metodo al que llamaran los coches que quieren cruzar del norte */
    public void entraCocheNorte(int nombre) throws InterruptedException {

    }

    /* metodo al que llamaran los coches que quieren cruzar del sur */
    public void entraCocheSur(int nombre) throws InterruptedException {

    }

    /* metodo para salir del puente, tanto si eres norte como sur */
    public synchronized void salirPuente(int nombre) {
    }
}
