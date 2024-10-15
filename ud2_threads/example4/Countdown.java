package ud2_threads.example4;

public class Countdown implements Runnable{
    @Override
    public void run() {
        for(int i=100; i>=0; i--){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
