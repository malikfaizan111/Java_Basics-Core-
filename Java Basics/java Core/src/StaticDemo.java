public class StaticDemo {
    int a = 10;
    static int b = 20;
    static void display(){
        System.out.println("static Method");
    }
    static{
        System.out.println("Static Block");
    }

    public static void main(String ...args){
//        System.out.println(a);
        StaticDemo st = new StaticDemo();
        System.out.println(st.a);
        System.out.println(b);
        display();
    }
}
class Demo{
    public static void main(String ...args){
//        System.out.println(StaticDemo.b);
//        StaticDemo.display();
    }
}

