public class Variable {
    int a = 10; // instance variable
    static int c = 30; // static variable
    public static void main(String args[]) {
//        System.out.println(a); give Error Because this is instance variable
        int b = 20; // local variable
        Variable var = new Variable();
        System.out.println(var.a);
        System.out.println(b);
        System.out.println(c);
    }
}

// type of varables
