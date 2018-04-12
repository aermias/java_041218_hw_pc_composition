package pc;

public class Resolution {
    private int width,
            height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }

    @Override
    public String toString() {
        return "Resolution{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
