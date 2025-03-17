package U1T1;
public class Bicycle extends Vehicle {
    private int gearCount;

    public Bicycle (String name, int wheels, int gearCount) {
        super(name, wheels);
        this.gearCount = gearCount;
    }

    public int getGearCount() {
        return gearCount;
    }

    public static void ringBell() {
        System.out.println("I just rung the bell.");
    }
}