package LamdaLearning;

@FunctionalInterface // if interface has a single method
interface MyLambda {
    public void display();
}

/*
 * class MyClass implements MyLambda
 * {
 * public void display(){
 * System.out.println("Hello World");
 * }
 * }
 */
public class LamdaDemo {
    public static void main(String[] args) {
        // anonyms inner Class
        // MyLambda m = new MyLambda() {
        // public void display(){
        // System.out.println("Hello World");
        // }
        // };

        // Lambda Expression
        MyLambda m = () -> {
            System.out.println("Hello World!");
        };

        m.display();
    }
}
