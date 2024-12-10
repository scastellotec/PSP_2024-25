package ejercicio2_productorConsumidor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        final int NUMERO_CONSUMIDORES = 3;
        final int NUMERO_PRODUCTORES = 5;

        ServidorImpresion servidor = new ServidorImpresion();

        // Cargo en un arrayList los productores
        ArrayList<Thread> productores = new ArrayList<>();
        // Los genero
        for(int i=0; i<NUMERO_PRODUCTORES; i++){
            productores.add(new Thread(new Usuario_productor(servidor, "user"+i)));
        }
        // Los inicio
        for(Thread t: productores)
            t.start();

        // Cargo en un arrayList los consumidores
        ArrayList<Thread> consumidores = new ArrayList<>();
        // Los genero
        for(int i=0; i<NUMERO_CONSUMIDORES; i++){
            consumidores.add(new Thread(new Impresora_consumidor(servidor)));
        }
        // Los inicio
        for(Thread t: consumidores)
            t.start();


        // Espero a que terminen todos los productores
        for(Thread t: productores) {
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Todos los productores han terminado");

        // Interrumpimos a los consumidores
        for(Thread t: consumidores) {
            try {
                t.interrupt();
            } catch (Exception e) {
                System.out.println("Consumidor parado");
            }
        }

        System.out.println("Fin del programa");

    }
}

