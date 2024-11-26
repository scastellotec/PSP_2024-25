package exercise12_collection;

public class Main {
    public static void main(String[] args) {
        Buffer b = new Buffer();
        new Thread(new Producer(b)).start();
        new Thread(new Consumer(b)).start();
    }

}
