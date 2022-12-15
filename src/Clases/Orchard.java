package Clases;


public class Orchard extends Thread{

    private int maxSpaces;
    private int occupiedSpaces = 0;

    public Orchard(int maxSpaces) {
        this.maxSpaces = maxSpaces;
    }

    public void cultivate(int quantity, String vegetable) {
        if (occupiedSpaces <= maxSpaces) {
            this.occupiedSpaces += quantity;
        }
    }

    public void consume(int quantity, String vegetable){
        if (occupiedSpaces >= maxSpaces){
            this.occupiedSpaces -= quantity;
        }
    }

    public int getOccupiedSpaces(){
        return this.occupiedSpaces;
    }
}
