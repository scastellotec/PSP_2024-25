
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise11 {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Determine which command to run
        String so = System.getProperty("os.name");
        String comando;
        if (so.equals("Linux")) {
            comando = "ifconfig";
        } else {
           comando = "ipconfig";
        }

        // Execute the command
        Process proceso = Runtime.getRuntime().exec(comando);

        // Show in the screen
        BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        // Result form the execution
        int codigoRetorno = proceso.waitFor();
        System.out.println("Codigo de la ejecución: " + codigoRetorno);
    }
}
