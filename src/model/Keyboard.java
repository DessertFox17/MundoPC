package model;

public class Keyboard extends InDevices{
    private int keyboardId;
    private static int keyboardCounter;

    public Keyboard(String inType, String brand) {
        super(inType, brand);
        this.keyboardId = ++Keyboard.keyboardCounter;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Keyboard{");
        sb.append("keyboardId: ").append(keyboardId);
        sb.append(", device: ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
