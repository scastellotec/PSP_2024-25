package exercise11_philosophers;

public class Philosopher implements Runnable{

    private Chopstick leftChopstick, rightChopstick;
    private String name;

    public Philosopher(String name, Chopstick rightChopstick, Chopstick leftChopstick) {
        this.name = name;
        this.rightChopstick = rightChopstick;
        this.leftChopstick = leftChopstick;
    }

    public void run(){
        while(true) {
            try {
                // Tiempo para pensar
                System.out.println(name + " pensando");
                Thread.sleep(1000);

                // Cogemos el tenedorIzquierdo
                synchronized (rightChopstick){
                    System.out.println(name+" Right");

                    // Si tenemos el izquierdo intento coger el derecho
                    synchronized (leftChopstick){
                        //tenedorDerecho.coger(getName());
                        System.out.println(name+" tiene tenedor left");
                        //Como un rato y los dejo
                        Thread.sleep(1000);
                        //tenedorDerecho.dejar(getName());
                        System.out.println(name+" deja tenedor left");
                    }
                    //tenedorIzquierdo.dejar(getName());
                    System.out.println(name+" deja tenedor right");
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
