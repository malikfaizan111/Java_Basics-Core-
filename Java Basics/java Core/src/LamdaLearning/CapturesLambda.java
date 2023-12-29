package LamdaLearning;

interface MyLambdaCapture{
    public void display();
}

class Demo{
    int temp = 10; //(3) ---
    public void method1()
    {
        int count = 0; //(2) ---
        MyLambdaCapture ml = () -> {
            System.out.println("Hi");
            // System.out.println("Bye"+count); // access those variables which are final or effective final
        System.out.println("Bye"+ (++temp));
        };

        //   MyLambdaCapture ml = () -> {
        //     int count = 0;  (1)---
        //     count++;
        //     System.out.println("Hi");
        //     System.out.println("Bye"+count);
        // };

        ml.display();
        // count++; this can prevent variable to be a final
    }
} 

class UseLambda{
    public void callLambda(MyLambdaCapture ml){
        ml.display();
    }
}

public class CapturesLambda {
    public static void main(String[] args) {
        // Demo d = new Demo();
        // d.method1();
        UseLambda ul = new UseLambda();
        ul.callLambda(()-> {System.out.println("Hello Lambda Paramter");});  // we are passing methods as an object
    }
}
