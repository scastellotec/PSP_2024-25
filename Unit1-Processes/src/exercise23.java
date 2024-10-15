
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise23 {
    public static void main(String[] args) throws IOException {

        // Creating the proces to be run
        ProcessBuilder pbuilder = new ProcessBuilder();
        pbuilder.command("java","Sumador","1","5");
        Process p = pbuilder.start();

        // Selecting the ouput for my program
        //proceso.redirectOutput(new File("test.txt"));

        BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
}
