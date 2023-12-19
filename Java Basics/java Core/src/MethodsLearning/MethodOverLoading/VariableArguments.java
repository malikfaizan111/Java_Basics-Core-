package MethodsLearning.MethodOverLoading;

public class VariableArguments {
    
    static void show(int ...x){
        for(int a:x){
            System.out.println(a);
        }
        System.out.println("End Of Array");
    }

        static void advanceArgument(int x,int ...y){
        for(int a:y){
            System.out.println(x+a);
        }
        System.out.println("End Of Advanced Arguments");
    }


    public static void main(String[] args) {
        show();
        show(10);
        show(10,20);
        show(10,20,30);
        show(10,20,30,40);
        show(new int[]{50,60,70,80});
        advanceArgument(10);
        advanceArgument(10,20);
    }
}
// var args must be last