package Clases;

import enums.ActionEnum;

import java.util.concurrent.Semaphore;

public class Producer extends Thread {

    private int quantity;
    private String vegetable;
    private int timeToGrow;
    private Orchard orchard;
    private Semaphore semaphore;

    public Producer(int quantity, String vegetable, int timeToGrow, Orchard orchard, Semaphore semaphore) {
        this.quantity = quantity;
        this.vegetable = vegetable;
        this.timeToGrow = timeToGrow;
        this.orchard = orchard;
        this.semaphore = semaphore;
    }

    @Override
    public void run(){
        try {
            semaphore.acquire();
            sleep(timeToGrow);
            orchard.cultivate(this.quantity, this.vegetable);
            System.out.println("Produced -> " + this.vegetable + " " +  this.quantity);
            System.out.println(orchard.getOccupiedSpaces());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
