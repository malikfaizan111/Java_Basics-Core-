//  Threads Synchronization

//  1) synchronized Keyword
// class Example{
//     synchronized void display(){
//         Thread g =  Thread.currentThread();
//         for(int i=0;i<=5;i++){
//             try{
//                 Thread.sleep(1000);
//                 System.out.println(g.getName() +" "+i);
//             }
//             catch(Exception e){}
//         }
//     }
// }

// class T extends Thread {
//     Example e;

//     T(Example e) {
//         this.e = e;
//     }

//     public void run() {
//         e.display();
//     }
// }

// public class ThreadSynchronization {

//     public static void main(String[] args) {
//         Example ex = new Example();
//         T t1 = new T(ex);
//         T t2 = new T(ex);
//         T t3 = new T(ex);
//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }


// 2)  synchronization block
// class Example {
//     void display() {
//         Thread g = Thread.currentThread();
//         for (int i = 0; i <= 5; i++) {
//             try {
//                 Thread.sleep(1000);
//                 System.out.println(g.getName() + " " + i);
//             } catch (Exception e) {
//             }
//         }
//         synchronized (this) {
//             for (int i = 0; i <= 5; i++) {
//                 try {
//                     Thread.sleep(1000);
//                     System.out.println(g.getName() + " " + i);
//                 } catch (Exception e) {
//                 }
//             }
//         }
//     }
// }

// class T extends Thread {
//     Example e;

//     T(Example e) {
//         this.e = e;
//     }

//     public void run() {
//         e.display();
//     }
// }

// public class ThreadSynchronization {

//     public static void main(String[] args) {
//         Example ex = new Example();
//         T t1 = new T(ex);
//         T t2 = new T(ex);
//         T t3 = new T(ex);
//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }


// 3) Synchronization Static Block
class Example {
    synchronized static void display() {
        Thread g = Thread.currentThread();
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(g.getName() + " " + i);
            } catch (Exception e) {
            }
        }
    }
}

class T extends Thread {

    public void run() { 
        Example.display();
    }
}

public class ThreadSynchronization {

    public static void main(String[] args) {
        Example ex = new Example();
        T t1 = new T();
        T t2 = new T();
        T t3 = new T();
        t1.start();
        t2.start();
        t3.start();
    }
}
