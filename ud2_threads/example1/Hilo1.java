package ud2_threads.example1;

public class Hilo1 implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("thread1: "+i);
        }
    }
}
