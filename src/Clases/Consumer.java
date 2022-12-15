package Clases;

public class Consumer extends Thread{

    private int quantity;
    private Orchard orchard;
    private String vegetable;

    public Consumer(int quantity, String vegetables, Orchard orchard) {
        this.quantity = quantity;
        this.vegetable = vegetables;
        this.orchard = orchard;
    }

    @Override
    public void run(){
        orchard.consume(this.quantity, this.vegetable);
        System.out.println("Consumed -> " + this.vegetable + " " +  this.quantity);
        System.out.println(orchard.getOccupiedSpaces());
    }
}
