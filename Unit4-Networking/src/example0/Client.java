package example0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        System.out.println("Starting the client");

        try {
            // Connect to the server to the specified port
            Socket connection = new Socket("localhost", 6565);

            // Opening input and output streams
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));

            PrintWriter output = new PrintWriter(connection.getOutputStream(),
                    true);

            // Send an receive information to or from the server
            output.println("Hello");

            String serverMessage = input.readLine();
            System.out.println("Server: "+serverMessage);

            // Close the connection
            connection.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
