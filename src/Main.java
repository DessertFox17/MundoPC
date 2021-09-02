import model.*;


public class Main {
    public static void main(String[] args) {
        Screen screenSamsung = new Screen("Samsung",24);
        Keyboard keyboardGenius = new Keyboard("Wire", "Genius");
        Mouse mouseGenius = new Mouse("Wire", "Genius");
        PC pc1 = new PC("PC Samsung",screenSamsung,keyboardGenius,mouseGenius);

        Screen screenHP= new Screen("HP",24);
        Keyboard keyboardLogitech = new Keyboard("Bluetooth", "Logitech");
        Mouse mouseLogitech = new Mouse("Bluetooth", "Logitech");
        PC pc2 = new PC("PC HP",screenHP,keyboardLogitech,mouseLogitech);

        Order order1 = new Order();
        order1.addAPC(pc1);
        order1.addAPC(pc2);
        order1.printOrder();
    }
}
