package SingeltonConcept;
// eg: coffee maching in an office

class CoffeeMachine {
    private float coffeeQty;
    private float waterQty;
    static private CoffeeMachine our = null;
    static private int counter = 5;

    static public int getCounter(){
        if(counter != 0){
            return counter--;
        }
        else{
            return -1;
        }
    }

    static public CoffeeMachine getInstance() {
        if(getCounter() != -1){
            our = new CoffeeMachine();
        }
        return our;
    }

    private CoffeeMachine() {
        coffeeQty = 1;
        waterQty = 1;
    }

    public void fillWater(float qty) {
        waterQty = qty;
    }

    public void fillCoffee(float qty) {
        coffeeQty = qty;
    }
}

public class SingleTon {
    public static void main(String[] args) {
        CoffeeMachine c1 = CoffeeMachine.getInstance(); // create without new mean it is not static but singleton
        CoffeeMachine c2 = CoffeeMachine.getInstance();
        CoffeeMachine c3 = CoffeeMachine.getInstance();
        CoffeeMachine c4 = CoffeeMachine.getInstance();
        CoffeeMachine c5 = CoffeeMachine.getInstance();
        CoffeeMachine c6 = CoffeeMachine.getInstance();
        CoffeeMachine c7 = CoffeeMachine.getInstance();
        System.out.println(c1 + " " + c2 + " " + c3+ " " +c4 + " " + c5+ " " +c6 + " " + c7);
        if (c1 == c2 && c1 == c3) {
            System.out.println("Same");
        }
    }
}
