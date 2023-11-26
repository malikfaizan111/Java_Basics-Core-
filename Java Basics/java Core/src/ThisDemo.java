public class ThisDemo {
    int a = 10;

    void display(){
        int a = 20;
        System.out.println("Local variable = "+a);
        System.out.println("Referral to Instance Variable = "+ this.a);
    }

    public static void main(String ...args){
        ThisDemo obj = new ThisDemo();
        obj.display();
    }


}

