package StaticLearning;
class Outer{
    static long price = 100;
    static{
        System.out.println("Block 1");
    }
        static{
        System.out.println("Block 1");
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        Outer out1 = new Outer();
        System.out.println(out1.price);
        Outer out2 = new Outer();
        out1.price = 4500;
        System.out.println(out2.price);
    }
        static{
        System.out.println("Main Block 1");
    }
}
