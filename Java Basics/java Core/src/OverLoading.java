public class OverLoading {
    // constructor overloading
    // method overloading
    // operator overloading

    // 1) constructor overloading
//    OverLoading(){
//        System.out.println("Constructor without arguments");
//    }
//
//    OverLoading(int a){
//        System.out.println("constructor with arguments");
//    }


//    2) Method Overloading
    void add(){
        int a = 10, b = 20;
        int c = a + b;
        System.out.println("SUM="+c);
    }

    void add(int x,int y){
        int z = x + y;
        System.out.println("SUM="+z);
    }

}

class CoverLoad{

    public static void main(String ...args){

//        1) Constructor Overloading

//        OverLoading ov = new OverLoading();
//        OverLoading ov1 = new OverL oading(10);

//        2) Method OverLoading

//        OverLoading method = new OverLoading();
//        method.add();
//        method.add(40,50);

//        3) Operator Overloading

        int a = 10, b=30;
//        System.out.println("a=b="+a+b); a=b=1030
        System.out.println("a=b="+(a+b));
    }

}

// Method OverLoading is Compile time polymorphism. this is called static binding