package exercise5_parking;

public class Parking {

    private int numberSpacesAvailable;

    public Parking(int numberSpacesAvailable) {
        this.numberSpacesAvailable = numberSpacesAvailable;
    }

    /**
     * The car checks if there is a free space
     * If so, takes a space (-1)
     * If not, it should wait to be notified
     */
    public void enterParking(){

    }

    /**
     * You just leave and (+1)
     * notify in case other cars are waiting for a free space
     */
    public void leaveParking(){

    }
}
