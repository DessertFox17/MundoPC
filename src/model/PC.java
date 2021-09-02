package model;

public class PC {
    private final int pcId;
    private String name;
    private Screen screen;
    private Keyboard keyboard;
    private Mouse mouse;
    private static int pcCounter;

    private PC() {
        this.pcId = ++PC.pcCounter;
    }

    public PC(String name, Screen screen, Keyboard keyboard, Mouse mouse) {
        this();
        this.name = name;
        this.screen = screen;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public int getPcId() {
        return pcId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PC{");
        sb.append("pcId: ").append(pcId);
        sb.append(", name: ").append(name);
        sb.append(", screen: ").append(screen);
        sb.append(", keyboard: ").append(keyboard);
        sb.append(", mouse: ").append(mouse);
        sb.append('}');
        return sb.toString();
    }
}
