package U9T1Lab3;

public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
      super(licensePlate, tollFee, passengers);
      this.axles = axles;
      this.hasTrailer = hasTrailer;
    }
  
    public int getAxles() {
      return axles;
    }
  
    public boolean hasTrailer() {
      return hasTrailer;
    }

    public void printTruck() {
        System.out.print("License plate: " + getLicensePlate() + "\n");
        System.out.print("Toll fee: " + getTollFee() + "\n");
        System.out.print("Passengers: " + getPassengers() + "\n");
        System.out.print("Number of axles: " + axles + "\n");
        System.out.print("Has trailer? " + hasTrailer);
    }

    public boolean validateLicensePlate() {
      if (hasTrailer) {
        if (axles > 4) {
          if (getLicensePlate().substring(getLicensePlate().length() - 2).equals("MX")) {
            return true;
          } else {
            return false;
          }
        } else if (axles <= 4) {
          if (getLicensePlate().substring(getLicensePlate().length() - 2).equals("LX")) {
            return true;
          } else {
            return false;
          }
        }
      }
      return true;
    }
}