package exercise90_blockinqueque;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue s = new ArrayBlockingQueue(1);

        Thread producer = new Thread(new Producer(s));
        Thread consumer = new Thread(new Consumer(s));
        Thread consumer1 = new Thread(new Consumer(s));
        Thread consumer2 = new Thread(new Consumer(s));

        producer.start();
        consumer.start();
        consumer1.start();
        consumer2.start();


    }
}
