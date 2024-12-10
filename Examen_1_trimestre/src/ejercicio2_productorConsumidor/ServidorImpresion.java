package ejercicio2_productorConsumidor;

public class ServidorImpresion {

    private String trabajoParaImprimir = null;

    public ServidorImpresion() {
    }

    public synchronized void enviarTrabajo(String trabajo) throws InterruptedException {
        while(trabajoParaImprimir!=null){
            System.out.println("Esperando: "+trabajo);
            wait();
        }
        trabajoParaImprimir = trabajo;
        System.out.println("Preparado: "+trabajo);
        notifyAll();
    }

    public synchronized void imprimirTrabajo() throws InterruptedException {
        while(trabajoParaImprimir == null){
            System.out.println("Consumidor esperando");
            wait();
        }
        System.out.println("Imprimiendo: "+trabajoParaImprimir);
        trabajoParaImprimir = null;
        notifyAll();
    }

}
