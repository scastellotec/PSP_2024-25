package exercise5_parking;

public class Main {

    public static void main(String[] args) {
        // New parking shared by all the cars
        Parking p = new Parking(3);

       Car c1 = new Car(p, "Car1");
       Car c2 = new Car(p, "Car2");
       Car c3 = new Car(p, "Car3");
       Car c4 = new Car(p, "Car4");
       Car c5 = new Car(p, "Car5");
       Car c6 = new Car(p, "Car6");
        Car c7 = new Car(p, "Car7");
        Car c8 = new Car(p, "Car8");
        Car c9 = new Car(p, "Car9");
        Car c10 = new Car(p, "Car10");
        Car c11= new Car(p, "Car11");
        Car c12 = new Car(p, "Car12");

       c1.start();
       c2.start();
       c3.start();
       c4.start();
       c5.start();
       c6.start();
        c7.start();
        c8.start();
        c9.start();
        c10.start();
        c11.start();
        c12.start();
    }
}
