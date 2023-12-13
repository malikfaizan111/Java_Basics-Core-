package InnerMultiple;

abstract class My {
    abstract public void myMethod();
}

interface InFace {
    abstract public void InFaceMethod();
}

class Outer {
    public void display() {
        class Inner {
            public void show() {
                System.out.println("Hello");
            }
        }
        new Inner().show();
        // Inner i = new Inner();
        // i.show();
    }

    public void abstractLocal() {
        new My() {
            public void myMethod() {
                System.out.println("Hello Override anonyms Inner Classs");
            }
        }.myMethod();
        // you can do same in inteface
        new InFace() {
            public void InFaceMethod() {
                System.out.println("Hello Override anonyms Inner Interface object");
            }
        }.InFaceMethod();
    }
}

public class LocalInner {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.display();
        out.abstractLocal();
    }
}
