package U1T1_OwnSC;

public class MRRunner {
    public static void main(String[] args) {
        MarvelRivals game1 = new MarvelRivals(10, 500, "Royal Palace, Yggsgard");

        Vanguard Thing = new Vanguard(10, 500, "Royal Palace, Yggsgard", "CLOBBERIN' TIME", 100);
        System.out.println(Thing.getMatchD());
        System.out.println(Thing.getTotalHealth());
        
        Thing.losing();
        Thing.dying();
        System.out.println(Thing.getULT());
        System.out.println(Thing.getDamage());

        Strategist Mantis = new Strategist(10, 500, "Royal Palace, Yggsgard", 20, 3);
        System.out.println(Mantis.getHealing());
        Mantis.helping();
        System.out.println(Mantis.getCoolDown());

        game1.winning();
        System.out.println(Mantis.getMatchD());
        System.out.println(Mantis.getMap());
    }
} 