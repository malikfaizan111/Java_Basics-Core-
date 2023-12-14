package Packages_Concept;

import Packages_Concept.Access_Modifiers.*;
import Packages_Concept.inner.Demo4;

public class Package_main {
       public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.display();

        Demo2 d2 = new Demo2();
        d2.show();
        // System.out.println(d1.a+d1.b+d1.c+d1.d); private, protected and default are not accessible
        Demo4 d4 = new Demo4();
        d4.diffPackSubClass();
    }
}
