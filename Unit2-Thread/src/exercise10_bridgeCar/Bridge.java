package exercise10_bridgeCar;

public class Bridge {

    private int nCochesNorte = 0;
    private int nCochesSur = 0;
    private boolean isBusy = false;

    /* metodo al que llamaran los coches que quieren cruzar del norte */
    public synchronized void entraCocheNorte(int nombre) throws InterruptedException {
        nCochesNorte++;
        while(isBusy || nCochesSur > nCochesNorte){
            System.out.println(nombre+" North:"+nCochesNorte+" Sur:"+nCochesSur);
            wait();
        }
        System.out.println(nombre + " crossing the bridge from North side");
        isBusy = true;
        nCochesNorte--;
    }

    /* metodo al que llamaran los coches que quieren cruzar del sur */
    public synchronized void entraCocheSur(int nombre) throws InterruptedException {
        nCochesSur++;
        while(isBusy || nCochesNorte >= nCochesSur){
            System.out.println(nombre+" North:"+nCochesNorte+" Sur:"+nCochesSur);
            wait();
        }
        System.out.println(nombre + " crossing the bridge from South side");
        isBusy = true;
        nCochesSur--;
    }

    /* metodo para salir del puente, tanto si eres norte como sur */
    public synchronized void salirPuente(int nombre) {
        System.out.println(nombre + " leaving the bridge");
        isBusy = false;
        notifyAll();
    }
}
