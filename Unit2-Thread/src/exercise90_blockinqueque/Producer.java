package exercise90_blockinqueque;


import example6_producerConsumer.SharedObject;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer implements Runnable{

    private ArrayBlockingQueue sObject;

    public Producer(ArrayBlockingQueue sObject) {
        this.sObject = sObject;
    }

    @Override
    public void run() {
        String frase = "Hola, buenos dias!";
        try{
            for(int i=0; i<frase.length(); i++){
                sObject.put(frase.charAt(i));
            }

            sObject.put('0');
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}

