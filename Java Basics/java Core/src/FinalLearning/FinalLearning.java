package FinalLearning;

class Test{
    public final void show(){
        System.out.println("Hello");
    }
}

class Test1 extends Test{
    // public void show(){} Error Final MEthod not overriding
}
public class FinalLearning {
    
    final boolean  direct = true; // direct initializetion
    static final float PI;
    static{ // static initialization
        PI = 3.1425f; // final allowed in this case because of static
    }
    final float Pie;
    public FinalLearning(){ // constructor initialization
        Pie = 45;
    }
    public static void main(String[] args) {

        // PI = 2333 error
        System.out.println(PI);// error
    }
}
