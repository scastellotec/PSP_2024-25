package exercise2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread threadCalculator = new Thread(new Calculator());

        System.out.print("The game starts in: ");
        Thread.sleep(500);
        System.out.print("3 ");
        Thread.sleep(500);
        System.out.print("2 ");
        Thread.sleep(500);
        System.out.print("1 ");
        Thread.sleep(500);
        System.out.print("YA!\n ");

        threadCalculator.start();
        Thread.sleep(10000);
        threadCalculator.interrupt();

    }
}
