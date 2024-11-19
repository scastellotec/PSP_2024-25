package exercise90_blockinqueque;

import example6_producerConsumer.SharedObject;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer implements Runnable{

    private ArrayBlockingQueue sObject;

    public Consumer(ArrayBlockingQueue sObject) {
        this.sObject = sObject;
    }

    @Override
    public void run() {
        char c;

        try {
            while ((c = (char) sObject.take()) != '0') {
                System.out.print(c);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
