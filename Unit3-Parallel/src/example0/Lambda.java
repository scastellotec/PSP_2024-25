package example0;

public class Lambda {
    public static void main(String[] args) {
        new Thread(()-> System.out.println("Hello from my Lmabda Thread")).start();
        new Thread(()-> System.out.println("Hello from my Lmabda Thread")).start();
        new Thread(()-> System.out.println("Hello from my Lmabda Thread")).start();
        new Thread(()-> System.out.println("Hello from my Lmabda Thread")).start();

    }
}
