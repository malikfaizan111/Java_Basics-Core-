package MutiThreading;

public class BasicSolutionInterfaceBased implements Runnable {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }

    public static void main(String[] args) {
      BasicSolutionInterfaceBased m = new BasicSolutionInterfaceBased();
      Thread t = new Thread(m);
      t.start();
      int i = 1;
      while (true) {
          System.out.println(i + " Word");
          i++;
      }
    }
}
