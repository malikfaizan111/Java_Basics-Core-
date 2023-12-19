package ThreadsLearning;

class MyData {

    synchronized public void display(String str) {
        // synchronized (this) {
        //     for (int i = 0; i < str.length(); i++) {
        //         System.out.println(str.charAt(i));
        //     }
        // }
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
                try{
                    Thread.sleep(100); // even sleeping no thread entering
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
    }
}

class Thread1 extends Thread {
    MyData sharedData;

    public Thread1(MyData d) {
        sharedData = d;
    }

    public void run() {
        sharedData.display("Hello Thread1");
    }
}

class Thread2 extends Thread {
    MyData sharedData;

    public Thread2(MyData d) {
        sharedData = d;
    }

    public void run() {
        sharedData.display("Hello Thread2");
    }
}

public class SynchronizationThread {
    public static void main(String[] args) {
        MyData data = new MyData();
        Thread1 t1 = new Thread1(data);
        Thread2 t2 = new Thread2(data);

        t1.start();
        t2.start();
    }
}
