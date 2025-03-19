package U9T1Lab2;

public class Dog extends Animal {
    private boolean hasBeenWalked;
    private int energy;

    public Dog (String name, int age, boolean vaccinated, String breed, boolean hasBeenWalked, int energy) {
        super(name, age, vaccinated, breed);
        this.hasBeenWalked = hasBeenWalked;
        this.energy = energy;
    }

    public boolean getWalked() {
        return hasBeenWalked;
    }

    public int getEnergy() {
        return energy;
    }

    public void walk() {
        System.out.println("Time to walk, little buddy!");
        energy --;
    }
}