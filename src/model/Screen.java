package model;

public class Screen {
    private final int screenId;
    private String brand;
    private double size;
    private static int screenCounter;

    private Screen() {
        this.screenId = ++Screen.screenCounter;
    }

    public Screen(String brand, double size) {
        this();
        this.brand = brand;
        this.size = size;
    }

    public int getScreenId() {
        return screenId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Screen{");
        sb.append("screenId: ").append(screenId);
        sb.append(", brand: ").append(brand);
        sb.append(", size: ").append(size);
        sb.append('}');
        return sb.toString();
    }
}
