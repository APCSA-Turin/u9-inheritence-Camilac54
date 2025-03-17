package U1T1;

public class VehicleRunner {
    public static void main(String[] args) {
        // // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        // System.out.println(myVehicle.getName());
        // System.out.println(myVehicle.getWheels());
        // myVehicle.move(10);
        // myVehicle.turn();
        // myVehicle.brake();

        // // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        // System.out.println(myCar.getName()); // inherited method
        // System.out.println(myCar.getWheels()); // inherited method
        // System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        // myCar.move(30); // inherited method
        // myCar.turn(); // inherited method
        // myCar.brake(); // inherited method
        // myCar.honk(); // method ONLY available on Car objects
        // myCar.lockDoors(); // method ONLY available on Car objects

        // // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----
        // Bicycle vehicle = new Bicycle("Name name", 8, 5);
        // System.out.println(vehicle.getName());
        // System.out.println(vehicle.getWheels());
        // vehicle.move(15);
        // vehicle.turn();
        // vehicle.brake();
        // System.out.println(vehicle.getGearCount());
        // vehicle.ringBell();

        // Truck test code
        Truck myTruck = new Truck ("Best Truck Ever", 8, "red", "Teddy Bear", 5);
        System.out.println(myTruck.getName());
        System.out.println(myTruck.getWheels());
        myTruck.move(20);
        myTruck.turn();
        myTruck.brake();
        
        System.out.println(myTruck.getColor());
        System.out.println(myTruck.getGrillDecor());
        System.out.println(myTruck.getHorns());
        myTruck.description();
        myTruck.truckStop();


    }
}