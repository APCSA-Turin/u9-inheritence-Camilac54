package U1T1;

public class Truck extends Vehicle {
    private String color;
    private String grillDecor;
    private int hornLoudness;

    public Truck (String name, int wheels, String color, String grillDecor, int hornLoudness) {
        super(name, wheels);
        this.color = color;
        this.grillDecor = grillDecor;
        this.hornLoudness = hornLoudness;
    }

    public String getColor() {
        return color; 
    }

    public String getGrillDecor() {
        return grillDecor;
    }

    public int getHorns() {
        return hornLoudness;
    }

    public static void description() {
        System.out.println("I am a big truck!!!");
    }

    public static void truckStop() {
        System.out.println("I'm stopping at a TRUCK STOP now!");
    }
}