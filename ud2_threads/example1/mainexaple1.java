package ud2_threads.example1;

public class mainexaple1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start the program");

        //Thread 1
        Hilo1 h1 = new Hilo1();
        Thread t1 = new Thread(h1);

        //Thread 2
        Hilo2 h2 = new Hilo2();
        Thread t2 = new Thread(h2);

        t1.start();
        t2.start();

        t1.join();

        System.out.println("T1 finished");

        t2.join();

        System.out.println("End the progam");
    }
}
