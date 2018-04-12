package pc;

public class Motherboard {
    private String model,
            manufacturer,
            bios;
    private int ramSlots,
            cardSlots;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String os) {
        System.out.println(os + " is now running");
    }

    public String getModel() { return model; }
    public String getManufacturer() { return manufacturer; }
    public int getRamSlots() { return ramSlots; }
    public int getCardSlots() { return cardSlots; }
    public String getBios() { return bios; }

    @Override
    public String toString() {
        return "Motherboard{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", ramSlots=" + ramSlots +
                ", cardSlots=" + cardSlots +
                ", bios='" + bios + '\'' +
                '}';
    }
}
