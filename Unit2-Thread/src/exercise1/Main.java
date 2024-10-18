package exercise1;

public class Main {

    public static void main(String[] args) {

        // Launch the two threads with the message desired
        new Thread(new MyThread("TIC")).start();
        new Thread(new MyThread("TAC")).start();
    }
}
