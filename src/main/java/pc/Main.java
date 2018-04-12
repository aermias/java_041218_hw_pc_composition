package pc;

public class Main {
    static final String separator = "=======================================================================================";
    public static void main(String[] args) {
        Motherboard motherboard = new Motherboard("BJ-2000", "Asus", 4, 6, "v2.44");
        Monitor monitor = new Monitor("Macintosh", "Apple", 27, new Resolution(2500, 1500));
        Case case1 = new Case("zzx10", "Dell", "110V", new Dimensions(20, 20, 5));

        PC computer = new PC(motherboard, monitor, case1);

        System.out.println(computer.getClass().getSimpleName() + "\'s details:");
        // System.out.println(computer.toString());
        System.out.println(computer);
        System.out.println(separator);

        computer.getMotherboard().loadProgram("OXS El Capitan");
        // Case.pressPowerButton(); Monitor.showLogo(1200, 500, "red");
        computer.powerUp(1200, 500, "red");

        System.out.println(separator);

        // Case.pressPowerButton(); Monitor.showLogo(1200, 50, "silver");
        computer.powerUp(1200, 50, "silver");
    }
}
