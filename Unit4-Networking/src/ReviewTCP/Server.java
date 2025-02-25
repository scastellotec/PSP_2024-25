package ReviewTCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static void main(String[] args) throws IOException {
        // Abro el pùerto de conexion
        ServerSocket serverSocket = new ServerSocket(9090);
        System.out.println("Servidor inicializado, esperando clientes");

        while(true) {
            // Aceptar clientes
            Socket client = serverSocket.accept();

            // Creo los canales de comunicacion input y output
            BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter output = new PrintWriter(client.getOutputStream(),true);

            // Collección de numeros
            ArrayList<Integer> notas = new ArrayList<>();

            String DatoRecibido = input.readLine();

            while(!DatoRecibido.equals("media")){
                int nota = Integer.parseInt(DatoRecibido);
                notas.add(nota);
                output.println("Nota recibida: "+nota);
                DatoRecibido = input.readLine();
            }

            long resultado = notas.stream().count();
            output.println("Has evniado "+resultado+" notas");

            // Cierre de la conexión
            client.close();
            System.out.println("Conexión con cliente finalizada");
        }


    }
}
