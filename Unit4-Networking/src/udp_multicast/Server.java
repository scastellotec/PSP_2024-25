package udp_multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Server {
    public static void main (String args[]){
        try {
            // Creamos la conexion multicast
            MulticastSocket socketUDP = new MulticastSocket(6789);
            // Construimos el DatagramPacket para enviar el mensaje
            String mensaje = "Hola a todos, esto es un mensaje multicast";
            DatagramPacket respuesta = new DatagramPacket(mensaje.getBytes(),
            mensaje.length(), InetAddress.getByName("230.0.0.1"), 6789);
            // Enviamos el mensaje
            socketUDP.send(respuesta);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
