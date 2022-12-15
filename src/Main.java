import Clases.Consumer;
import Clases.Orchard;
import Clases.Producer;
import Handlers.ControlCenter;
import enums.Vegetables;

import java.util.concurrent.Semaphore;

public class Main {

    public static int MAX_TIME_TO_GROW = 10;
    public static int MAX_ORCHARD_SPACES = 10;
    public static int SEMAPHORE_PERMITS = 10;
    public static void main(String[] args)  {

        Orchard orchard = new Orchard(MAX_ORCHARD_SPACES);

        ControlCenter controlCenter = new ControlCenter(MAX_TIME_TO_GROW, orchard.getOccupiedSpaces(), SEMAPHORE_PERMITS, orchard);

        controlCenter.createNewRequest(1);




    }
}
