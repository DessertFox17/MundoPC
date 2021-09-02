package model;

public class Mouse extends InDevices {
    private int mouseId;
    private static int mouseCounter;

    public Mouse(String inType, String brand) {
        super(inType, brand);
        this.mouseId = ++Mouse.mouseCounter;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mouse{");
        sb.append("mouseId: ").append(mouseId);
        sb.append(", device: ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
