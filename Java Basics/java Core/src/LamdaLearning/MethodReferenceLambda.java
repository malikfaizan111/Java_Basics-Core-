package LamdaLearning;

@FunctionalInterface
interface FinalLambda {
    public void display(String str);
}

class LambdaDemon {
    public void reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.err.println(sb);
    }
}

public class MethodReferenceLambda {

    public MethodReferenceLambda(String s){
        System.out.println(s.toUpperCase());
    }
    public static void main(String[] args) {
        // FinalLambda ml = System.out::println; // :: scope resolution
        // ml.display("Hello");
        // LambdaDemon Ld = new LambdaDemon();
        // FinalLambda ml = Ld::reverse;
        // FinalLambda ml = LambdaDemon::reverse; // if method is static

        FinalLambda ml = MethodReferenceLambda::new; // achieving polymorphism
        ml.display(":: Scope Resoultion in C++");
    }
}
