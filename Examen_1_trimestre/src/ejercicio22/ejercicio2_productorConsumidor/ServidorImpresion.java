package ejercicio22.ejercicio2_productorConsumidor;

import java.util.LinkedList;

public class ServidorImpresion {

    private int numeroMaximo = 5;
    private LinkedList<String> listaTrabajos = new LinkedList<>();

    public ServidorImpresion() {
    }

    public synchronized void enviarTrabajo(String trabajo) throws InterruptedException {
        while(listaTrabajos.size() >= numeroMaximo){
            System.out.println("Esperando: "+trabajo);
            wait();
        }
        listaTrabajos.add(trabajo);
        System.out.println("Preparado: "+trabajo);
        notifyAll();
    }

    public synchronized void imprimirTrabajo() throws InterruptedException {
        while(listaTrabajos.size() == 0){
            System.out.println("Consumidor esperando");
            wait();
        }
        System.out.println("Imprimiendo: "+listaTrabajos.pollFirst());
        notifyAll();
    }

}
