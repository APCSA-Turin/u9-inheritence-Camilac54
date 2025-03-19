package U9T1Lab2;

public class Animal {
    private String name;
    private int age;
    private boolean vaccinated = false;
    private String breed;

    public Animal(String name, int age, boolean vaccinated, String breed) {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    private String getBreed() {
        return breed;
    }
    
    public static void adopted(Animal animal) {
        System.out.println(animal.getName() + " has just been welcomed into a new loving home!");
    }

    public static void feed() {
        System.out.println("All animals have been fed their favorite foods!");
    }
}