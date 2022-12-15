package enums;

public class Vegetables {
     String [] vegetables = {
     "lettuce",
     "cabbage",
     "onion",
     "spinach",
     "potato",
     "celery",
     "asparagus",
     "radish",
     "broccoli",
     "artichoke",
     "tomato",
     "cucumber",
     "eggplant",
     "carrot",
     "green_bean"
     };

     public String getVegetable(){
          return vegetables[(int) (Math.random() * vegetables.length)];
     }

     public int timeToGrow(int MaxTime){
          return (int) (Math.random() * MaxTime);
     }
}
