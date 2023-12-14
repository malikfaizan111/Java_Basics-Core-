package ExceptionLearning;

public class NestedCatchBlock {

    public static void main(String[] args) {
        try {
            int A[] = { 10, 0, 5, 3, 6, 3 };
            try {
                int r;
                r = A[0] / A[1];
                System.out.println(r);
            } catch (ArithmeticException e) { // this can be a subclass of below super class
                System.out.println(e);
            }
            System.out.println(A[10]);
        } catch (ArrayIndexOutOfBoundsException e) { // this can be a superclass of upper given sub class
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally Here");
        }
    }
}
