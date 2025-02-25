package ReviewTCPThreaded;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        // Establezco conecion con servidor
        Socket servidor = new Socket("localhost",9090);

        // Creo los canales de comunicacion input y output
        BufferedReader input = new BufferedReader(new InputStreamReader(servidor.getInputStream()));
        PrintWriter output = new PrintWriter(servidor.getOutputStream(),true);

        // Dialogo con el servidor
        Scanner sc = new Scanner(System.in);

        String datoLeido = "";

        do{
            datoLeido = sc.nextLine();
            output.println(datoLeido);
            System.out.println(input.readLine());
        }while(!datoLeido.equals("media"));

        //Cierro conexion
        servidor.close();

    }
}
