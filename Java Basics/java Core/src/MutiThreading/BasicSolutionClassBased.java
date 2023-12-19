package MutiThreading;

class MyThread extends Thread{
    public void run(){
        int i = 1;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}
public class BasicSolutionClassBased {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
           int i = 1;
        while (true) {
            System.out.println(i + " Word");
            i++;
        }
    }
}

// you can use with this in single class