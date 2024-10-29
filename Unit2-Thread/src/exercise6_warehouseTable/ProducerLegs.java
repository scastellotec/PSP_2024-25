package exercise6_warehouseTable;

public class ProducerLegs extends Thread{

    private Warehouse wh;

    public ProducerLegs(Warehouse wh){
        this.wh = wh;
    }

    @Override
    public void run() {
        while(true){
            try {
                wh.storeLeg();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
