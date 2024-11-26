package exercise12_primitive;

public class Buffer {

    int[] data;
    int size;
    int count;

    public Buffer(int size) {
        this.data = new int[size];
        this.size = size;
        this.count = 0;
    }

    public synchronized void putData(int a) throws InterruptedException {
        // Mientras no haya hueco para guardar espero
        while(count==size){
            System.out.println("Producer waits... ");
            wait();
        }
        // Escribo dato donde me digan
        data[count] = a;
        count++;
        System.out.println("Put =>"+a);

        notifyAll();
    }

    public synchronized void takeData() throws InterruptedException {
        //Mientras no haya dato para leer espero
        while(count==0){
            System.out.println("Consumer waits... ");
            wait();
        }
        // Leo el dato que me digan
        System.out.println("Take <="+data[0]);

        // Muevo todos un hueco
        for(int i=1; i<count;i++){
            data[i-1] = data[i];
        }

        count--;
        notifyAll();

    }
}
