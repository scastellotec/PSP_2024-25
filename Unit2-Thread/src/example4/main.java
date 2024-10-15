package ud2_threads.example4;

public class main {
    public static void main(String[] args) throws InterruptedException {
        // Define and start the thread
        Thread t1 = new Thread(new Countdown());
        t1.start();
        // Wait for 3 seconds
        Thread.sleep(3000);
        System.out.println("Interrumpiendo hilo");
        // Stop the thread
        t1.interrupt();
        System.out.println();

    }
}
