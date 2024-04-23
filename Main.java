public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle ("Toyota", "Passo", 2005, "Petrol");
        Car car1 = new Car ("Ford", "Ranger", 2023, "Diesel", 4, 5);
        Truck truck1 = new Truck ("Ford", "F-150", 2024, "Diesel", 5000, 3);
        Motorcycle motorcycle = new Motorcycle ("Yamaha", "YZF-R1", 2019, "Diesel", "998cc", true);

        vehicle1.start();
        vehicle1.stop();
        System.out.println("Car1 make: "+ car1.getMake());
        System.out.println("Car1 number of doors: "+ car1.getNumDoors());
        System.out.println("Car1 number of seats: "+ car1.getNumSeats());
        System.out.println("Truck1 cargo capacity: " + truck1.getCargoCapacity());
        System.out.println("Motorcycle1 has fairing: " + motorcycle.getHasFairing());

    }
}