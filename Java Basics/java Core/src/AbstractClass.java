
abstract class A{
    abstract void display();
}
abstract class B extends A{
    void display(){
        System.out.println("Abstract METHOD in A");
    }
    abstract void show();
}

class C extends B{
    void show(){
        System.out.println("SHOW METHOD IN C");
    }
}
/**
 * AbstractClass
 */
public class AbstractClass {
    public static void main(String ...args){
        C obj = new C();
        obj.display();
        obj.show();
    }
}  


// if any class contain alteast 1 abstract method so class is called abstract class
// Abstract method mean when declare a fn only not give definition to a particular fn. Hiding the implementation not declaration
// Abstract class contain abstract methods as well as normal methods
// concerete Class contain all normal method (complete methods)