package MyChat.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MainServer {

    public static ArrayList<ClientThread> myClients = new ArrayList<>();

    public static void main(String[] args) {
        try {
            // Open the serverSocket
            ServerSocket serverSocket = new ServerSocket(8888);
            while(true) {
                try {
                    Socket clientSocket = serverSocket.accept();
                    ClientThread client = new ClientThread(clientSocket);
                    myClients.add(client);
                    client.start();
                }catch (Exception e){
                    System.out.println("Something went wrong. Let's start over.");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void broadCastMessage(String username, String message){
        myClients.forEach(c -> c.printeBroadcastMessage(username, message));
    }
}
