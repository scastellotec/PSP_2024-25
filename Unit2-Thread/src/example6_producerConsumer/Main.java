package example6_producerConsumer;

public class Main {
    public static void main(String[] args) {
        SharedObject s = new SharedObject();

        Thread producer = new Thread(new Producer(s));
        Thread consumer = new Thread(new Consumer(s));

        producer.start();
        consumer.start();

    }
}
