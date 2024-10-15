
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise22 {
    public static void main(String[] args) throws IOException {
        String comando = args[0];

        ProcessBuilder pBuilder = new ProcessBuilder();
        pBuilder.command("cmd.exe","/C",comando);

        //proceso.redirectOutput(new File("test.txt"));
        Process p = pBuilder.start();

        BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }

        System.out.println("Execution Ended");
    }
}
