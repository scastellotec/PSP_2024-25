package udp_multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class Cliente2 {
    public static void main(String args[]) {
        /* Lo he hecho con las funciones LAMBDA
         * Esto no significa que entren para el examen
         */

        // Me conecto al socket
        try {
            MulticastSocket socketUDP = new MulticastSocket(6789);
            socketUDP.joinGroup(InetAddress.getByName("230.0.0.1"));

            // El hilo para enviar datagramas con lo que escribo
            new Thread(() -> {
                try {
                    while (true) {
                        // Construimos el DatagramPacket para enviar el mensaje
                        Scanner scanner = new Scanner(System.in);
                        String mensaje = scanner.nextLine();
                        DatagramPacket respuesta = new DatagramPacket(mensaje.getBytes(), mensaje.length(), InetAddress.getByName("230.0.0.1"), 6789);
                        // Enviamos el mensaje
                        socketUDP.send(respuesta);
                    }
                } catch (Exception e){
                    System.out.println("Excepcion en while");
                }
            }).start();


            // El hilo para leer los datagramas que recibo
            new Thread(() -> {
                try {
                    while (true) {
                        // Construimos un datagrama para recibir el mensaje
                        byte[] mensaje = new byte[1024];
                        DatagramPacket peticion = new DatagramPacket(mensaje, mensaje.length);
                        // Recibo el datagrama
                        socketUDP.receive(peticion);
                        // Mostramos la respuesta por pantalla
                        String respuesta = new String(peticion.getData());
                        System.out.println(respuesta);
                    }
                } catch (Exception e) {
                    System.out.println("Excepcion en while");
                }
            }).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
