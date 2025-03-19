package U9T1Lab2;

public class Cat extends Animal{
    private boolean hasPlayedWith;
    private int funMeter;

    public Cat (String name, int age, boolean vaccinated, String breed, boolean hasPlayedWith, int funMeter) {
        super(name, age, vaccinated, breed);
        this.hasPlayedWith = hasPlayedWith;
        this.funMeter = funMeter;
    }

    public boolean getPlayed() {
        return hasPlayedWith;
    }

    public int getFunMeter() {
        return funMeter;
    }

    public void play() {
        System.out.println("Time to play with the kitties!");
        funMeter ++;
    }
} 
