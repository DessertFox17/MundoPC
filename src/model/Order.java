package model;

public class Order {
    private final int orderId;
    private PC[] pcs;
    private int pcCounter;
    private static int orderCounter;
    private static final int MAX_PCS = 10;

    public Order() {
        this.orderId = ++Order.orderCounter;
        this.pcs = new PC[Order.MAX_PCS];
    }

    public void addAPC(PC pc){
        if(this.pcCounter < Order.MAX_PCS){
            this.pcs[this.pcCounter++] = pc;
        }
        else{
            System.out.printf("Max number of PCc in the order reached: %s%n", MAX_PCS);
        }
    }

    public void printOrder(){
        System.out.printf("Order #: %s%n",orderId);
        System.out.println("Order's products");
        for (int i = 0; i < pcCounter; i++) {
            System.out.println(this.pcs[i]);
        }
    }

}
