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

       c1.start();
       c2.start();
       c3.start();
       c4.start();
       c5.start();
       c6.start();
    }
}
