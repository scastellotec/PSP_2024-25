package example6_producerConsumer;

public class Consumer implements Runnable{

    private SharedObject sObject;

    public Consumer(SharedObject sObject) {
        this.sObject = sObject;
    }

    @Override
    public void run() {
        char c;

        try {
            while ((c = sObject.getData()) != '0') {
                System.out.print(c);
            }
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
