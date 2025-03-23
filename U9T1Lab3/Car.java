package U9T1Lab3;

public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;
    
    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
      super(licensePlate, tollFee, passengers);
      this.electric = electric;
      discountApplied = false;   // default value
    }
  
    public boolean isElectric() {
      return electric;
    }
  
    public boolean isDiscountApplied() {
      return discountApplied;
    }

    public void printCar() {
        System.out.print("License plate: " + getLicensePlate() + "\n");
        System.out.print("Toll fee: " + getTollFee() + "\n");
        System.out.print("Passengers: " + getPassengers() + "\n");
        System.out.print("Electric? " + electric + "\n");
        System.out.print("Discount applied? " + discountApplied);
    }

    public void applyDiscount() {
      if (discountApplied == false) {
        if (electric) {
          setTollFee(getTollFee() * 0.5);
          discountApplied = true;
        }
      }
    }

    public void setDiscount(boolean newVal) {
      discountApplied = newVal;
    }
}