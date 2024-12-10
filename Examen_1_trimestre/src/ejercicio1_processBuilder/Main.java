package ejercicio1_processBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //1. Generar .class= javac ClaseEjecutables.java

        //2.1 Recogería de los args[]
        String palabra = args[0];
        String numeroRepeticiones = args[1];

        // Determinar comando Windows o Linux
        String so = System.getProperty("os.name");
        if (so.contains("Windows")) {

            //2.2 Ejecuto con el processBuilder
            ProcessBuilder pb = new ProcessBuilder("java","ClaseEjecutable",palabra,numeroRepeticiones);
            Process codigoRetorno = pb.start();

            // Mostramos resultado por pantalla
            BufferedReader br=new BufferedReader(new InputStreamReader(codigoRetorno.getInputStream()));
            String line;
            while((line=br.readLine())!=null){
               System.out.println(line);
            }

            // Mostramos como ha ido la ejecucion
            if(codigoRetorno.exitValue() == 1){
                System.out.println("Ejecución incorrecta");
            }else{
                System.out.println("Ejecución correcta");
            }

        }else{
            System.out.println("No estas en Windows");
        }

    }
}
