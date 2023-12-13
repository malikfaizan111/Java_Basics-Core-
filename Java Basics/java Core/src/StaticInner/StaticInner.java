package StaticInner;

class Outer{
    int x = 10;
    static int z = 49;
    static class My{
    public void show(){
        System.out.println(z);
    }
    }
}
public class StaticInner {
    public static void main(String[] args) {
        Outer.My m = new Outer.My();
        m.show();
    }
}
