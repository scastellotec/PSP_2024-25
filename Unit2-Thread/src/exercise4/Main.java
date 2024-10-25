package exercise4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Counter c = new Counter(0);

        // 5 people created sharing the same object Counter c
        ArrayList<Thread> people = new ArrayList<>();
        for(int i=0; i<5; i++){
            people.add( new Thread(new Person(c)));
        }

        // Inicializo uno a uno
        for (Thread t: people){
            t.start();
        }

        // Espero que finalicen todos los hilos
        for (Thread t: people){
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // Muestro el resultado del contador
        System.out.println(c.getCount());
    }
}
