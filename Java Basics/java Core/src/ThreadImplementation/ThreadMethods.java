class Th extends Thread{
    public void run(){
        Thread tcurr = currentThread(); // current Thread
        System.out.println("Thread Status:" +tcurr.getName() + " " + tcurr.isAlive());
         for (int i = 0; i < 5; i++) {
            try{
                // Thread.sleep(1000); // sleep is static method and used inside try and catch
                tcurr.sleep(1000);
            }
            catch(Exception e){

            }
            System.out.println(i);
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        Th t = new Th();
        Th t2 = new Th();
        // System.out.println("ID= "+ t.threadId());
        // System.out.println("NAME OF THREAD IS = "+ t.getName());
        // t.setName("Threadoo");
        // System.out.println("NAME OF THREAD After change of Name IS = "+ t.getName());
        // System.out.println("Priority of Thread is = "+ t.getPriority());
        // t.setPriority(1); // 10 maximum 
        // System.out.println("After Set Priority of Thread is = "+ t.getPriority());

        t.start(); // start implicitly cass run method which is overide here.
        try{
            t.join();
        }
        catch(Exception e){

        }
        System.out.println("Thread1 Status:"+ t.isAlive());
        t2.start();
    }
}
