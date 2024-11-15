package exercise11_philosophers;

public class Main {
    public static void main(String[] args) {
        Chopstick chopstick1 = new Chopstick("1");
        Chopstick chopstick2 = new Chopstick("2");
        Chopstick chopstick3 = new Chopstick("3");
        Chopstick chopstick4 = new Chopstick("4");
        Chopstick chopstick5 = new Chopstick("5");


        Philosopher f1 = new Philosopher("[1]", chopstick2, chopstick1);
        Philosopher f2 = new Philosopher("[2]", chopstick2, chopstick3);
        Philosopher f3 = new Philosopher("[3]", chopstick3, chopstick4);
        Philosopher f4 = new Philosopher("[4]", chopstick4, chopstick5);
        Philosopher f5 = new Philosopher("[5]", chopstick5, chopstick1);

        new Thread(f1).start();
        new Thread(f2).start();
        new Thread(f3).start();
        new Thread(f4).start();
        new Thread(f5).start();
    }
}
