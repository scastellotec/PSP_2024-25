package ud2_threads.example3;

public class main {
    public static void main(String[] args) {

        HiloN h1 = new HiloN(1,10);
        HiloN h2 = new HiloN(10,20);

        Thread t1 = new Thread(h1, "hilo1");
        Thread t2 = new Thread(h2, "hilo2");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
