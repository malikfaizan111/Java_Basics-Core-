package ExceptionLearning;

public class MultipleCatchBlock {
    
    public static void main(String[] args) {
        try{
            int A[] = {10,0,5,3,6,3};
            int r;
            r = A[0] / A[1];
            System.out.println(r);
            System.out.println(A[10]);
        }
        catch(ArithmeticException e){ // this can be a subclass of below super class
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){ // this can be a superclass of upper given sub class
            System.out.println(e);
        }
        finally{
            System.out.println("Finally Here");
        }
    }
}
