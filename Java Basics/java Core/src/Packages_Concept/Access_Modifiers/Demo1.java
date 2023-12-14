package Packages_Concept.Access_Modifiers;

public class Demo1 {
    int a = 10; // this default
    private int b = 20;
    protected int c = 30;
    public int d = 40;
    
    public void display(){
        System.out.println(a+b+c+d);
    }
}