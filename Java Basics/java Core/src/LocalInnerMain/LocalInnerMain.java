package LocalInnerMain;

class Outer {
    int x = 10;
    static int z = 49;

    public void display() {
        class Inner {
            public void innerDisplay() {
                System.out.println(z);
            }
        }
        Inner in = new Inner();
        in.innerDisplay();
    }
}

public class LocalInnerMain {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.display();
    }
}
