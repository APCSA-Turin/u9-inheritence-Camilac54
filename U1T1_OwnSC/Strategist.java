package U1T1_OwnSC;

public class Strategist extends MarvelRivals{
    private int healing;
    private int coolDownTime;


    public Strategist (int matchDuration, int totalHealth, String map, int healing, int coolDownTime) {
        super(matchDuration, totalHealth, map);
        this.healing = healing;
        this.coolDownTime = coolDownTime;
    }

    public int getHealing() {
        return healing;
    }

    public int getCoolDown() {
        return coolDownTime;
    }

    public static void helping() {
        System.out.println("We are undefeatable!");
    }
}
