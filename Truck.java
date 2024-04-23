public class Truck extends Vehicle{
    private double cargoCapacity;
    private double towingCapacity;


    public Truck(String make, String model, int year, String fuelType, double cargoCapacity, double towingCapacity){
        super(make, model, year, fuelType);
        this.cargoCapacity = cargoCapacity;
        this.towingCapacity = towingCapacity;
    }

    public double getCargoCapacity(){
        return cargoCapacity;
    }
    public double getTowingCapacity(){
        return towingCapacity;
    }

    public String loadCargo(){
        return "Cargo loaded";
    }

    public String unloadCargo(){
        return "Cargo unloaded";
    }

}
