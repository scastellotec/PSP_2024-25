package ReviewTCPThreaded;

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
            new Thread(new ServerClientHandler(client)).start();

        }

    }
}
