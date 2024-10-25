package exercise4;

public class Person implements Runnable{

    private Counter c;

    public Person(Counter c) {
        this.c = c;
    }

    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            c.increment();
        }
    }
}
