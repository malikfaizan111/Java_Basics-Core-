package MutiThreading;

class MyThread extends Thread {
     MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread ID: " + this.getId());
    }
}

public class FirstThread {
    public static void main(String[] args) {
        MyThread t = new MyThread("My Thread 1");
        t.start(); 
    }
}