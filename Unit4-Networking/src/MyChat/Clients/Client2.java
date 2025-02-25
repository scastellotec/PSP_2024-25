package MyChat.Clients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) {
        Socket conexion = null;
        try {
            conexion = new Socket("localhost", 8888);
            BufferedReader input = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            PrintWriter output = new PrintWriter(conexion.getOutputStream(), true);

            new Thread(() -> {
                Scanner scanner = new Scanner(System.in);
                while(true){
                    String mensaje = scanner.nextLine();
                    output.println(mensaje);
                    if(mensaje.equals("EXIT"))
                        break;
                }
            }).start();

            new Thread(() -> {
                while(true){
                    try {
                        System.out.println(input.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
