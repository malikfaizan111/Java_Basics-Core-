package ThreadsLearning;

class MyThread extends Thread {
    MyThread(String name) {
        super(name);
        // setPriority(Thread.MIN_PRIORITY + 2);
    }

    @Override
    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count);
            try {
                Thread.sleep(1000);
                System.out.println("Thread woke up");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            count++;
        }
    }
}

public class InitialThread {
    public static void main(String[] args) {
        MyThread t = new MyThread("My Thread 1");
        System.out.println("ID " + t.getId());
        System.out.println("NAME " + t.getName());
        System.out.println("PRIORITY " + t.getPriority());
        System.out.println("State " + t.getState());
        System.out.println("IsAlive " + t.isAlive());
        t.start();
        System.out.println("ID " + t.getId());
        System.out.println("NAME " + t.getName());
        System.out.println("PRIORITY " + t.getPriority());
        System.out.println("State " + t.getState());
        System.out.println("IsAlive " + t.isAlive());
        t.interrupt();
        System.out.println("ID " + t.getId());
        System.out.println("NAME " + t.getName());
        System.out.println("PRIORITY " + t.getPriority());
        System.out.println("State " + t.getState());
        System.out.println("IsAlive " + t.isAlive());

    }
}
