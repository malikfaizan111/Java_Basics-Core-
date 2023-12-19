package RecursionConcept;

public class RecursionBase {

    static void fun1(int n) {
        if (n > 0) {
            System.out.println(n);
            fun1(n - 1);
        }
    }

    static void fun2(int n) {
        if (n > 0) {
            fun1(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        fun1(3);
        fun2(3);
    }
}

        