package ud2_threads.example0;

public class threds0 {
    public static void main(String[] args) {
        System.out.println("Two Threads");

        MyFirstThread myRunnable = new MyFirstThread();
        Thread thread1 = new Thread(myRunnable);
        thread1.start();

        System.out.println("End of the progam");

    }
}
