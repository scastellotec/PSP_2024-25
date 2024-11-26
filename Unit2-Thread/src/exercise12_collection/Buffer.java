package exercise12_collection;

import java.util.LinkedList;

public class Buffer {

    LinkedList<Integer> data;
    int size;
    int count;

    public Buffer(int size) {
        data = new LinkedList<>();
        this.size = size;
        this.count = 0;
    }

    public synchronized void putData(int a) throws InterruptedException {
        while(count==size){
            wait();
        }
        data.push(a);
        count++;
    }

    public synchronized void takeData() throws InterruptedException {
        while(count==0){
            wait();
        }
        System.out.println(data.pop());
        count--;
    }
}
