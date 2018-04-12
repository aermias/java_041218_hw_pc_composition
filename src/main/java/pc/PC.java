package pc;

public class PC {
    private Motherboard motherboard;
    private Monitor monitor;
    private Case case1;

    public PC(Motherboard motherboard, Monitor monitor, Case case1) {
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.case1 = case1;
    }

    private void drawLogo(int x, int y, String color) {
        this.monitor.showLogo(x, y, color);
    }

    public void powerUp(int x, int y, String color) {
        this.case1.pressPowerButton();
        this.drawLogo(x, y, color);
    }

    public Motherboard getMotherboard() { return motherboard; }
    public Monitor getMonitor() { return monitor; }
    public Case getCase1() { return case1; }

    @Override
    public String toString() {
        return "PC{" +
                "motherboard=" + motherboard +
                ", monitor=" + monitor +
                ", case1=" + case1 +
                '}';
    }
}
