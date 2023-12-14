package ExceptionLearning;

public class CustomCreateException extends Exception {
    
    // Min Bank Account Balance = 5000;
    public String toString(){
        return "Min Balance Should be 5000";
    }

    public static void Balance(int balance) throws CustomCreateException{
        if(balance < 5000){
            throw new CustomCreateException();
        }
        else{
            System.out.println("Current Balance= "+ balance);
        }
    }
    public static void main(String[] args) {
        try{
        Balance(50);
        }
        catch(CustomCreateException e){
            System.out.println(e);
        }

    }
}
