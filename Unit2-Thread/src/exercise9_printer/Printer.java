package exercise9_printer;

public class Printer {

    private int numero = 1;
    private char caracter = 'A';
    private boolean numberFirst = false;

    public synchronized void imprimeNumero() throws InterruptedException {
        while(numberFirst){
            wait();
        }
        System.out.print(numero);
        numero++; //Esto sirve para imprimir el siguiente numero
        numberFirst = true;
        notifyAll();
    }

    public synchronized void imprimeCaracter() throws InterruptedException {
        while(!numberFirst){
            wait();
        }
        System.out.print(caracter);
        caracter++;  //Esto sirve para imprimir el siguiente caracter
        numberFirst = false;
        notifyAll();
    }

}
