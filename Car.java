public class Car extends Vehicle {
    private int numDoors;
    private int numSeats;

    public Car(String make, String model, int year, String fuelType, int numDoors, int numSeats){
        super(make, model, year, fuelType);
        this.numDoors = numDoors;
        this.numSeats = numSeats;
    }

    public int getNumDoors(){
        return numDoors;
    }

    public int getNumSeats(){
        return numSeats;
    }
    public void openDoor(){
        System.out.println("Door Opened");
    }

    public void closeDoor(){
        System.out.println("Door closed");
    }


}
