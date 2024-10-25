package example6_producerConsumer;

public class SharedObject {

    private char data;
    private boolean read;

    public SharedObject() {
        this.read = true;
    }

    public synchronized char getData() throws InterruptedException {
        // If it has been read already you have to wait
        while(read){
            wait();
        }
        this.read = true;
        notify();
        return data;
    }

    public synchronized void setData(char data) throws InterruptedException {
        // If it hasn't been read yet you have to wait
        while(!read){
            wait();
        }
        this.data = data;
        notify();
        this.read = false;
    }
}
