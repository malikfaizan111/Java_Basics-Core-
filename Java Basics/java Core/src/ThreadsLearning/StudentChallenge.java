package ThreadsLearning;

class ATM{
    
    synchronized public void checkBalance(String name){
        System.out.print(" CHeck Balance "+ name);
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){

        }
            System.out.print(" Balance ");
    }

       synchronized  public void withDraw(String name, int ammount){
        System.out.print(" Withdraw By "+ name + " Amount "+ ammount);
           try{
            Thread.sleep(1000);
        }
        catch(Exception e){

        }
            System.out.print(ammount);
    }
}

class Customer extends Thread{
    ATM atm;
    String name;
    int ammount;

    public Customer(String name,int amount, ATM a){
        this.name = name;
        this.ammount = amount;
        this.atm = a;
    }
    public void useAtm(){
        atm.checkBalance(name);
        atm.withDraw(name, ammount);
    }
    public void run(){
        useAtm();
    }
}
public class StudentChallenge {
    public static void main(String[] args) {
        ATM a = new ATM(); // atm is shared
        Customer c1 = new Customer("Faizan", 500,a);
        Customer c2 = new Customer("Jawad", 1000, a);
        c1.start();
        c2.start();
    }
}
 