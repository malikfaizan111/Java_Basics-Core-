package Abstract;

abstract class Super {
    public void sup() {
        System.out.println("Super");
        
    }

    abstract void me();
    
    static class BatMan {
        
        public void methodBat(){
            System.out.println("Static Methods");
        }
    }
}

public class BaseAbstract extends Super {
    // Super s = new Super(); cannot create instance of abstract class
    @Override
    public void me(){
        System.out.println("Method Overriding");
    }
    static{
        System.out.println("Hi Static");
    }
    public static void main(String[] args) {
        System.out.println("HI Main");
        BatMan b = new BatMan();
        b.methodBat();
    }
}
