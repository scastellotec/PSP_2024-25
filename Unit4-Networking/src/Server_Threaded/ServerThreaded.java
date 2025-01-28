package Server_Threaded;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThreaded {
    public static void main(String[] args) {

        try {
            // Open the serverSocket
            ServerSocket serverSocket = new ServerSocket(8888);

            while(true) {
                try {
                    // Accept new clients
                    System.out.println("Waiting for new clients...");
                    Socket clientSocket = serverSocket.accept();

                    // Put the runnable inside a Thread and start it
                    new Thread(new ClientHandler(clientSocket)).start();

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
