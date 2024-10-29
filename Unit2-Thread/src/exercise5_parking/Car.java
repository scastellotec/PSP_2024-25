package exercise5_parking;

public class Car extends Thread{

    private Parking p;
    private String name;

    public Car(Parking p, String name) {
        this.p = p;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            p.enterParking(name);
            Thread.sleep(3000);
            p.leaveParking(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
