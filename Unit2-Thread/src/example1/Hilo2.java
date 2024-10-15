package example1;

public class Hilo2 implements Runnable{
    @Override
    public void run() {
        for(int i=10; i<20; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("thread2: "+i);
        }
    }
}
