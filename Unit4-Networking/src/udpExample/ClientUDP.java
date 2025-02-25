package udpExample;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP {
    public static void main(String args[]){
        try {
            // Preparo la conexión del DatagramSocket
            DatagramSocket socketUDP = new DatagramSocket();

            // Preparo el DatagramPacket a enviar
            byte[] mensaje = "texto a enviar".getBytes();
            InetAddress hostServidor = InetAddress.getByName("localhost");
            int puertoServidor = 6789;

            // Construimos un datagrama para enviar el mensaje al servidor
            DatagramPacket peticion = new DatagramPacket(mensaje, mensaje.length,
            hostServidor, puertoServidor);

            // Enviamos el datagrama
            socketUDP.send(peticion);

            // Preparo un DatagramPacket vacio que contendrá la respuesta
            byte[] bufer = new byte[24];
            DatagramPacket respuesta = new DatagramPacket(bufer, bufer.length);
            socketUDP.receive(respuesta);

            // Muestro por pantalla la respuesta.
            System.out.println("Respuesta: " + new String(respuesta.getData()));

            // Cerramos el socket
            socketUDP.close();
        } catch (IOException e) {
            System.out.println("Socket: " + e.getMessage());
        }
    }
}