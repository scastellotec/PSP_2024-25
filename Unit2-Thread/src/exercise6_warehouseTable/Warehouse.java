package exercise6_warehouseTable;

public class Warehouse {
    private final int MAX_LEGS = 6;
    private final int MAX_TABLETOPS = 2;

    private int numberLegsStored = 0;
    private int numberTabletopStored = 0;

    public Warehouse() {
    }

    public void storeLeg(){
        numberLegsStored++;

    }

    public void storeTabletop(){
        numberTabletopStored++;
    }

    public void buildTable(){
        System.out.println("table built!");
        numberTabletopStored -= 1;
        numberLegsStored -= 4;

    }

}
