package exercise4;

public class Counter {

    private int count;

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public synchronized void increment(){
        count++;
    }
}
