package exercise6_warehouseTable;

public class ProducerTabletop extends Thread{

    private Warehouse wh;

    public ProducerTabletop(Warehouse wh){
        this.wh = wh;
    }

    @Override
    public void run() {
        while(true){
            try {
                wh.storeTabletop();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
