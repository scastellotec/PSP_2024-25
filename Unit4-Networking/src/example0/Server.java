package example0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int port = 6565;
        System.out.println("Starting the server, listening to port: "+port);

        try {
            // Open the connection = Wait for future clients on the specified port
            ServerSocket serverSocket = new ServerSocket(port);

            while(true) {

                try {
                    // Getting a new client
                    Socket clientConnection = serverSocket.accept();

                    System.out.println("Client connected");

                    // Opening input and output streams to be able to talk to the client
                    BufferedReader clientInput = new BufferedReader(
                            new InputStreamReader(clientConnection.getInputStream()));

                    PrintWriter clientOutput = new PrintWriter(clientConnection.getOutputStream(),
                            true);

                    // Conversation with the client
                    String clientMessage = clientInput.readLine();
                    System.out.println("Client: " + clientMessage);

                    clientOutput.println("Good bye");

                    clientConnection.close();

                } catch (Exception ex){
                    System.out.println("Error en la conexion con cliente, empezando de nuevo");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
