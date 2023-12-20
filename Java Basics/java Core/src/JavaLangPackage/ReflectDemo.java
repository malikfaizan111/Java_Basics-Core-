package JavaLangPackage;

import java.lang.reflect.*;

class My {
    private int a;
    protected int b;
    public int c;
    int d;

    public My() {
    }

    public My(int x, int y) {
    }

    public void display(String s1, String s2) {
    }

    public int show(int x, int y) {
        return 0;
    }
}

public class ReflectDemo {
    public static void main(String[] args) {
        Class c = My.class; // get definition of class My
        System.out.println(c.getName());
        // or second way
        // My m = new My();
        // Class c1 = m.getClass();

        Field field[] = c.getDeclaredFields();
        for (Field f : field) {
            System.out.println(f);
        }

        Constructor con[] = c.getConstructors();

        for (Constructor ct : con) {
            System.out.println(ct);
        }

        Method Mt[] = c.getMethods();

         for (Method m : Mt) {
            System.out.println(m);
        }

   
        Parameter pm[] = Mt[1].getParameters();

        for (Parameter p : pm) {
            System.out.println(p);
        }
    }
}
