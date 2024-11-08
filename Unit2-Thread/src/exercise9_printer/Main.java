package exercise9_printer;

public class Main {
    public static void main(String[] args) {
        // Object we will be sharing
        Printer p = new Printer();

        // Threads to launch
        new Thread(new Numbers(p)).start();
        new Thread(new Letters(p)).start();


    }

}
