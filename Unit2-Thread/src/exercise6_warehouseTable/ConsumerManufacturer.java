package exercise6_warehouseTable;

public class ConsumerManufacturer extends Thread{

    private Warehouse wh;

    public ConsumerManufacturer(Warehouse wh){
        this.wh = wh;
    }

    @Override
    public void run() {
        while(true){
            try {
                wh.buildTable();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
