class Parent{

    Parent(){
        System.out.println("PARENT CONSTRUCTOR");
    }
    int a = 40;
    void display(){
        System.out.println("PARENT CLASS");
    }
}

class Children extends Parent{

    // super();  implicitly called by the JVM
    Children(){
        System.out.println("CHILDREN CONSTRUCTOR");
    }

    int a = 30;
    void display(){
        System.out.println("CHILD CLASS");
        System.out.println(a);
        System.out.println("super accessing Parent Variable = "+super.a);
        super.display();
    }
}
public class SuperClass {
    
    public static void main(String ...args){
       Children obj = new Children();
       obj.display();
    }
}
