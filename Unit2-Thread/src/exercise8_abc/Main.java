package exercise8_abc;

public class Main {
    public static void main(String[] args) {
        // Create the shared object between Producer and Consumer
        AbcBuffer abc= new AbcBuffer();

        // Generate the Consumer and Producer Threads
        new Thread(new Consumer(abc,"Consumer1")).start();
        new Thread(new Consumer(abc,"Consumer2")).start();
        new Thread(new Producer(abc)).start();

    }

}
