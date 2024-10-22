package exercise3;

public class Main {

    public static void main(String[] args) {
        // Thread 1
        //double operation1 = (1*2);
        operationRunnable r1 = new operationRunnable(1,2,'+');
        Thread t1 = new Thread(r1);
        t1.start();

        // Thread 2
        operationRunnable r2 = new operationRunnable(1,2,'*');
        Thread t2 = new Thread(r2);
        t2.start();

        // Wait for both threads to finnish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Result 1: "+r1.getResult());
        System.out.println("Result 2: "+r2.getResult());

        double resultado = (double) r1.getResult() / (double) r2.getResult();
        System.out.println(resultado);
    }
}
