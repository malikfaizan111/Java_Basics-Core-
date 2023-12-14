package Packages_Concept.Access_Modifiers;

public class Demo2 {
    
    Demo1 d = new Demo1();

    public void show(){
        // System.out.println(d.a+d.b+d.c+d.d);// b is not accessible because it is private
        System.out.println("B private properties of Demo1 is not accessible");
    }
}
