package MutiThreading;

class Test{
    static void display(){
        int i = 1;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}
public class BasicProblem {
    public static void main(String[] args) {
        Test.display();
           int i = 1;
        while (true) {
            System.out.println(i + " Word");
            i++;
        }
    }
}
