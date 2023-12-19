
package ThreadsLearning;

class ThreadTest extends Thread {
    ThreadTest(String name) {
        super(name);
        // setPriority(Thread.MIN_PRIORITY + 2);
    }

    @Override
    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++ + "My Thread");

        }
    }
}

public class DemonThread {
    public static void main(String[] args) throws Exception {
        ThreadTest t = new ThreadTest(" My Thread 1");
        t.setDaemon(true); // main process terminated thread also terminated..
        t.start();
        // sleep main method
        // try{
        // Thread.sleep(100);
        // }
        // catch(Exception e){
        // System.out.println(e);
        // }
        // Thread mainThread = Thread.currentThread();
        // mainThread.join();
        int count = 1;
        while (true) {
            System.out.println(count++ + " Main Thread");
            Thread.yield(); // give more time to my thread
        }

    }
}
