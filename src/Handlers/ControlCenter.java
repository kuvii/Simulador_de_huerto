package Handlers;

import Clases.Consumer;
import Clases.Orchard;
import Clases.Producer;
import enums.Vegetables;

import java.util.concurrent.Semaphore;

public class ControlCenter {

    private int maxTimeToGrow;
    private int maxOrchardSpaces;
    private int semaphorePermits;
    private Orchard orchard;

    public ControlCenter(int maxTimeToGrow, int maxOrchardSpaces, int semaphorePermits, Orchard orchard) {
        this.maxTimeToGrow = maxTimeToGrow;
        this.maxOrchardSpaces = maxOrchardSpaces;
        this.semaphorePermits = semaphorePermits;
        this.orchard = orchard;
    }



    public void createNewRequest(int quantity){
        Semaphore semaphore = new Semaphore(this.semaphorePermits);

        Vegetables vegetable = new Vegetables();
        String vegetableName = vegetable.getVegetable();
        int vegetableTime = vegetable.timeToGrow(maxTimeToGrow);

        Producer producer = new Producer(quantity, vegetableName, vegetableTime, this.orchard, semaphore);
        Consumer consumer = new Consumer(quantity, vegetableName, this.orchard);

        producer.start();
        consumer.start();
        semaphore.release();


    }
}
