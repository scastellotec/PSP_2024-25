package ejercicio2_productorConsumidor;

public class Usuario_productor implements Runnable{

    private ServidorImpresion servidorImpresion;
    private String nombre;

    public Usuario_productor(ServidorImpresion servidorImpresion, String nombre) {
        this.servidorImpresion = servidorImpresion;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        // Cada usuarios envia trabajos de 0 a 4: nombreusuario_trabajo0.pdf
        for (int i=0; i<5; i++){
            try {
                servidorImpresion.enviarTrabajo(nombre + "_trabajo" + i + ".pdf");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
