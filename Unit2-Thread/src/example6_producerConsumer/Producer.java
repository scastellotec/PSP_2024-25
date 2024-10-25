package example6_producerConsumer;

public class Producer implements Runnable{

    private SharedObject sObject;

    public Producer(SharedObject sObject) {
        this.sObject = sObject;
    }

    @Override
    public void run() {
        String frase = "Hola, buenos dias!";
        try{
            for(int i=0; i<frase.length(); i++){
                sObject.setData(frase.charAt(i));
            }

            sObject.setData('0');
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
