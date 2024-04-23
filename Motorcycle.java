public class Motorcycle extends Vehicle{
    private String engineDisplacement;
    private boolean hasFairing;

    public Motorcycle(String make, String model, int year, String fuelType, String engineDisplacement, boolean hasFairing){
        super(make, model, year, fuelType);
        this.engineDisplacement = engineDisplacement;
        this.hasFairing = hasFairing;
    }

    public String getEngineDisplacement(){
        return engineDisplacement;
    }

    public boolean getHasFairing(){
        return hasFairing;
    }

    public String startKick(){
        return "started kick";
    }

    public String performWheelie(){
        return "performed wheelie";
    }

}
