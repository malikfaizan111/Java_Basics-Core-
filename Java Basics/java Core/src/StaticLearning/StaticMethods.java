package StaticLearning;

class Parent {
    static void staticMethod() {
        System.out.println("Parent's static method");
    }
}

class Child extends Parent {
    static void staticMethod() {
        System.out.println("Child's static method");
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        Parent.staticMethod(); // Output: "Parent's static method"
        Child.staticMethod(); // Output: "Child's static method"

        Parent parentRef = new Child();
        parentRef.staticMethod(); // Output: "Parent's static method"
    }
}