package pc;

public class Monitor {
    private String model,
            manufacturer;
    private double size;
    private Resolution resolution;

    public Monitor(String model, String manufacturer, double size, Resolution resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.resolution = resolution;
    }

    public void showLogo(int x, int y, String color) {
        System.out.println("showing logo at " + x + " by " + y + " in color " + color);
    }

    public String getModel() { return model; }
    public String getManufacturer() { return manufacturer; }
    public double getSize() { return size; }
    public Resolution getResolution() { return resolution; }

    @Override
    public String toString() {
        return "Monitor{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", size=" + size +
                ", resolution=" + resolution +
                '}';
    }
}
