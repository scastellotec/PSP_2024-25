package Server_noThreaded;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try {
            // Open the serverSocket
            ServerSocket serverSocket = new ServerSocket(8888);

            while(true) {
                try {
                    // Accept new clients
                    System.out.println("Waiting for new clients...");
                    Socket clientSocket = serverSocket.accept();

                    // Open the input/output buffers
                    BufferedReader input = new BufferedReader(
                            new InputStreamReader(clientSocket.getInputStream()));
                    PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);

                    //1. Envio un mensaje al ciente
                    output.println("Write something to capitalize: ");

                    //2. recibo algo del cliente
                    String clientMesage = input.readLine();

                    //3. Lo paso a mayusculas y se lo envío al cliente
                    output.println(clientMesage.toUpperCase());

                    // Close connection with client
                    clientSocket.close();

                    // Get ready to accept new clients
                }catch (Exception e){
                    System.out.println("Something went wrong. Let's start over.");
                }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
