public class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle (String make, String model, int year, String fuelType){
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public String getFuelType(){
        return fuelType;
    }

    public void start(){
        System.out.println("Vehicle started");
    }

    public void stop(){
        System.out.println("Vehicle stopped");
    }

    public void accelerate(){
        System.out.println("Vehicle accelerated");
    }

    public void brake(){
        System.out.println("Vehicle brake");
    }

}
