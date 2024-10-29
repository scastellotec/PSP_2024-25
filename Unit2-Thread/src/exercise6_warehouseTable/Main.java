package exercise6_warehouseTable;

public class Main {
    public static void main(String[] args) {
        Warehouse wh = new Warehouse();

        ProducerLegs pLegs = new ProducerLegs(wh);
        ProducerTabletop pTabletop = new ProducerTabletop(wh);
        ConsumerManufacturer cManufacturer = new ConsumerManufacturer(wh);

        pLegs.start();
        pTabletop.start();
        cManufacturer.start();
    }
}
