package udpExample;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServerUDP {

    public static void main (String args[]){
        try {
            // Abrimos un DatagramSocket en el puerto 6789
            DatagramSocket socketUDP = new DatagramSocket(6789);
            byte[] bufer = new byte[24];

            while (true) {
                // Construimos el DatagramPacket para recibir peticiones
                DatagramPacket peticion = new DatagramPacket(bufer, bufer.length);

                // Leemos una petición del DatagramSocket
                socketUDP.receive(peticion);

                // Muestro lo que me envía el cliente
                System.out.println("Direccion cliente: "+peticion.getAddress());
                System.out.println("Puerto cliente: "+peticion.getPort());
                System.out.println("Mensaje cliente: "+new String(peticion.getData()));

                /* Tenemos el mensaje del cliente, y calculamos la repuesta*/
                String mensajeRepuesta = "response";

                // Construimos el DatagramPacket para enviar la respuesta
                DatagramPacket respuesta = new
                        DatagramPacket(mensajeRepuesta.getBytes(),
                        mensajeRepuesta.length(),peticion.getAddress(), peticion.getPort());

                // Enviamos la respuesta, que es un eco
                socketUDP.send(respuesta);
            }
        } catch (Exception e) {
            System.out.println("IO: " + e.getMessage());
        }
    }
}