package Server_Threaded;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable{

    private Socket clientSocket;

    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
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

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
