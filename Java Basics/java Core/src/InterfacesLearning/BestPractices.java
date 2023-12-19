package InterfacesLearning;

interface Testing1 {
    final static int X = 10;

    void method1();

    void method2();

    default void method3() {
        System.out.println("Default Method Body"); // modifiy existing interface later on without
        // disturbing old classes (implemented classes)
        internal();
    }

    static void method4() {
        System.out.println("static Method Body");
    }

    private void internal(){
        // not abstract internal private method use to perform internal operation
    }
}

interface Testing2 extends Testing1 {
    void meth4();

}

class My implements Testing2 {
    public void method1() {
    }

    public void method2() {
    }

    public void meth4() {
    }

    public void method3() {
        System.out.println("override default method");
    }
}

public class BestPractices {
    public static void main(String[] args) {
        My m = new My();
        System.out.println(Testing1.X);
        m.method3();
        Testing1.method4();
    }
}
