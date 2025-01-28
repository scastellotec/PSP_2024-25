package Server_noThreaded;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        try {
            //open the connection with the server
            Socket socket = new Socket("localhost",8888);

            //open the input and output streams
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            System.out.println("Conectado con el servidor");

            //1. Receive message from sever
            System.out.println(input.readLine());

            //2. Send something to server
            Scanner sc = new Scanner(System.in);
            String message = sc.nextLine();
            output.println(message);

            //3. Show reponse from the server
            System.out.println(input.readLine());

            // Close connection
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
