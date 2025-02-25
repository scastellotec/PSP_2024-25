package ReviewTCPThreaded;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.net.Socket;

public class ServerClientHandler implements Runnable{

    Socket client;
    BufferedReader input;
    PrintWriter output;

    public ServerClientHandler(Socket client) throws IOException {
        this.client = client;

        // Creo los canales de comunicacion input y output
        input = new BufferedReader(new InputStreamReader(client.getInputStream()));
        output = new PrintWriter(client.getOutputStream(),true);
    }

    @Override
    public void run() {

        // Collección de numeros
        ArrayList<Integer> notas = new ArrayList<>();

        String DatoRecibido = "";
        try {
            DatoRecibido = input.readLine();

            while(!DatoRecibido.equals("media")){
                int nota = Integer.parseInt(DatoRecibido);
                notas.add(nota);
                output.println("Nota recibida: "+nota);
                DatoRecibido = input.readLine();
            }

            long resultado = notas.stream().count();
            output.println("Has evniado "+resultado+" notas");

            // Cierre de la conexión
            client.close();
            System.out.println("Conexión con cliente finalizada");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
