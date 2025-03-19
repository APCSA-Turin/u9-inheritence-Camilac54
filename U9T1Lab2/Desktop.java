package U9T1Lab2;

public class Desktop extends Computer {
    // private int screenSize;
    // private int memory;
    private boolean monitorIncluded;

    public Desktop(int screenSize, int memory, boolean monitorIncluded) {
        // this.screenSize = screenSize;
        // this.memory = memory;
        super(screenSize, memory);
        this.monitorIncluded = monitorIncluded;
    }

    // public int getScreenSize() {
    //     return screenSize;
    // }

    // public int getMemory() {
    //     return memory;
    // }

    public boolean isMonitorIncluded() {
        return monitorIncluded;
    }

    // public void installOperatingSystem() {
    //     System.out.println("installing OS...");
    // }

    public void replaceTowerCasing() {
        System.out.println("Replaced tower case!");
    }
}