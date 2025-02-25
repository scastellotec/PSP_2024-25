package MyChat.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientThread extends Thread{

    private Socket socketCliente;
    private String username;
    private PrintWriter output;
    private BufferedReader input;

    public ClientThread(Socket socketCliente) throws IOException {
        this.socketCliente = socketCliente;
        this.username = "u1";

        // Inicio input y outout
        input = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
        output = new PrintWriter(socketCliente.getOutputStream(), true);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void printeBroadcastMessage(String username, String message){
        output.println("@"+username+": "+message);
    }

    @Override
    public void run() {
            while(true){
                try {
                    String message = input.readLine();
                    MainServer.broadCastMessage(username, message);
                }catch (Exception e){
                    MainServer.myClients.remove(this);
                    MainServer.broadCastMessage(username, "Se ha desconectado");
                }
            }
    }
}
