package exercise8_abc;

public class AbcBuffer {
    private char letra;
    private boolean read = true;

    public synchronized void put(char letra) throws InterruptedException {
        while(!read){
            wait();
        }
        this.letra = letra;
        read = false;
        notifyAll();
    }

    public synchronized void get(String name) throws InterruptedException {
        while(read){
            wait();
        }
        read = true;
        notifyAll();
        System.out.println(name+": "+letra);
    }
}

