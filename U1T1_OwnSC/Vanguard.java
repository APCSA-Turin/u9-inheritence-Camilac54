package U1T1_OwnSC;

public class Vanguard extends MarvelRivals {
    private String ULT;
    private int damage;

    public Vanguard(int matchDuration, int totalHealth, String map, String ULT, int damage) {
        super(matchDuration, totalHealth, map);
        this.ULT = ULT;
        this.damage = damage;
    }

    public String getULT() {
        return ULT;
    }
    
    public int getDamage() {
        return damage;
    }

    public static void dying() {
        System.out.println("Hey, Strategist, could use a little help here!");
    }
}
