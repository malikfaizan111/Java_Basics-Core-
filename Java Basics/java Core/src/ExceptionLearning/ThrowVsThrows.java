package ExceptionLearning;

public class ThrowVsThrows {
    static int area(int l,int b) throws Exception{
        if(l<0 || b<0){
           throw new Exception("Length and Breath Cannot be Negative");
        }
        else{
            int a = l * b;
        return a;
        }

    }
    
    static int calculateArea() throws Exception{
        int a = area(-10, 5);
        return a;

    }

    public static void main(String[] args) {
        try{
        int area = calculateArea();
        System.out.println(area);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Essentials parts to be executed");
        }

    }
}
