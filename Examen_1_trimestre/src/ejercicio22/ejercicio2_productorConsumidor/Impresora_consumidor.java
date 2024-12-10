package ejercicio22.ejercicio2_productorConsumidor;

public class Impresora_consumidor implements Runnable{

    private ServidorImpresion servidorImpresion;

    public Impresora_consumidor(ServidorImpresion servidorImpresion) {
        this.servidorImpresion = servidorImpresion;
    }

    @Override
    public void run() {
        while(true){
            try {
                servidorImpresion.imprimirTrabajo();
                // La impresora tarda unos 3 segundos en terminar de imprimir el trabajo.
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
