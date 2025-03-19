package U9T1Lab2;

public class Laptop extends Computer {
    // private int screenSize;
    // private int memory;
    private boolean trackPadCalibrated;

    public Laptop(int screenSize, int memory) {
        super(screenSize, memory);

        trackPadCalibrated = false;
    }

    // public int getScreenSize() {
    //     return screenSize;
    // }

    // public int getMemory() {
    //     return memory;
    // }

    public boolean isTrackPadCalibrated() {
        return trackPadCalibrated;
    }

    // public void installOperatingSystem() {
    //     System.out.println("installing OS...");
    // }

    public void calibrateTrackpad() {
        if (!trackPadCalibrated) {
            trackPadCalibrated = true;
            System.out.println("Calibration complete!");
        } else {
            System.out.println("No need to calibrate");
        }
    }
}