class Parent{
     void display(){
        System.out.println("PARENT");
    }
}
class Child extends Parent{
    void display(){
        super.display(); // this is class runtime polymorphism. this is called Dynamic Binding.
        System.out.println("CHILD");
    }
}
public class MethodOverriding {

    public static void main(String args[]){
        Child c = new Child();
        c.display();
    }
}