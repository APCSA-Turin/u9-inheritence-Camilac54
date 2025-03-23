package U9T1Lab3;

public class Taxi extends Car {
    private double fareCollected;

    public Taxi (String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super (licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }

    public void printTaxi() {
        System.out.print("License plate: " + getLicensePlate() + "\n");
        System.out.print("Toll fee: " + getTollFee() + "\n");
        System.out.print("Passengers: " + getPassengers() + "\n");
        System.out.print("Electric? " + isElectric() + "\n");
        System.out.print("Discount applied? " + isDiscountApplied() + "\n");
        System.out.print("Total fare collected: " + fareCollected + "\n"); 
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        fareCollected += (numRiders * farePerRider);
        setPassengers(numRiders + getPassengers());

        if (getPassengers() >= 4 && !isDiscountApplied()) {
            setTollFee(getTollFee() * 0.5);
            setDiscount(true);
        }
    }
}   
