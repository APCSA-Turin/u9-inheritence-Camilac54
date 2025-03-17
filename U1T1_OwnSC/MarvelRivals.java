package U1T1_OwnSC;

public class MarvelRivals {
    private int matchDuration;
    private int totalHealth;
    private String map;

    public MarvelRivals(int matchDuration, int totalHealth, String map) {
        this.matchDuration = matchDuration;
        this.totalHealth = totalHealth;
        this.map = map;
    }

    public int getMatchD() {
        return matchDuration;
    }

    public int getTotalHealth() {
        return totalHealth;
    }

    public String getMap() {
        return map;
    }

    public void winning() {
        System.out.println("The mission area is yours!");
    }

    public void losing() {
        System.out.println("They've captured the mission area!");
    }
}