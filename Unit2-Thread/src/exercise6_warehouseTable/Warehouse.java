package exercise6_warehouseTable;

public class Warehouse {
    private final int MAX_LEGS = 6;
    private final int MAX_TABLETOPS = 2;

    private int numberLegsStored = 0;
    private int numberTabletopStored = 0;

    public Warehouse() {
    }

    public synchronized void storeLeg() throws InterruptedException {
        while(numberLegsStored >= MAX_LEGS){
            System.out.println("Max legs reached");
            wait();
        }
        numberLegsStored++;
        System.out.println("New leg stored, total: "+numberLegsStored);
        notifyAll();

    }

    public synchronized void storeTabletop() throws InterruptedException {
        while(numberTabletopStored >= MAX_TABLETOPS){
            System.out.println("Max tabletop reached");
            wait();
        }
        numberTabletopStored++;
        System.out.println("New tabletop, total: "+numberTabletopStored);
        notifyAll();
    }

    public synchronized void buildTable() throws InterruptedException {
        while(numberLegsStored < 4 || numberTabletopStored < 1){
            System.out.println("Not enough resources");
            wait();
        }
        System.out.println("table built!");
        numberTabletopStored -= 1;
        numberLegsStored -= 4;
        notifyAll();
    }

}
