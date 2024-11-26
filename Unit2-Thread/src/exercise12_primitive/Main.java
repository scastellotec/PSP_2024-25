package exercise12_primitive;

public class Main {
    public static void main(String[] args) {
        Buffer b = new Buffer(4);
        new Thread(new Producer(b)).start();
        new Thread(new Consumer(b)).start();
    }

}
