package model;

public class InDevices {
    private String inType;
    private String brand;

    public InDevices(String inType, String brand) {
        this.inType = inType;
        this.brand = brand;
    }

    public String getInType() {
        return inType;
    }

    public void setInType(String inType) {
        this.inType = inType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InDevices{");
        sb.append("inType='").append(inType).append('\'');
        sb.append(", brand='").append(brand).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
