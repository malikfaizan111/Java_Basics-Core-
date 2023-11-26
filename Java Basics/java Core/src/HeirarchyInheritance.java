class Pa{
    int a = 10;
    void display(){
        System.out.println("PARENT");
    }
}

class Ch1 extends Pa{
    int b = 40;
    void show(){
        System.out.println("CHILD1");
    }
}
class Ch2 extends Pa{
    int c = 50;
    void dis(){
        System.out.println("CHILD2");
    }

}
public class HeirarchyInheritance {
    public static void main(String ...args){
        Ch1 obj1 = new Ch1();
        System.out.println(obj1.b);
        obj1.show();
        System.out.println(obj1.a);
        obj1.display();

        Ch2 obj2 = new Ch2();
        System.out.println(obj2.c);
        obj2.dis();
        System.out.println(obj2.a);
        obj2.display();
    }
}