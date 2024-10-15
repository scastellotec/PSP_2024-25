
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class exercise21 {

    public static void main(String[] args) throws Exception {
        // Determine which command to run
        String so = System.getProperty("os.name");
        String comando;
        if (so.equals("Linux")) {
            comando = "ifconfig";
        } else {
           comando = "ipconfig";
        }

        // Execute the command
        ProcessBuilder proceso = new ProcessBuilder();
        proceso.command(comando);
        // Redirect output to this file.
        proceso.redirectOutput(new File("resultadoExercise21.txt"));
        proceso.start();

        // Another way to run it
        new ProcessBuilder("ipconfig")
                .redirectOutput(new File("something.txt"))
                .start();

    }
}
