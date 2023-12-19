package JavaLangPackage;

class MyObject {
    public String toString() { // override toString Object class method
        return "My String";
    }
    public int hashCode(){
        return 100;
    }
    public boolean equals(Object o){
        return this.hashCode() == o.hashCode();
    }
    // public void wait(){} // cannot override final methods
}

class MyObject1 extends MyObject { // this inherit object class indirectly

}

public class ObjectClass {
    public static void main(String[] args) {
        Object ob1 = new Object();
        Object ob2 = new Object();
        // System.out.println(ob1.equals(ob1)); // true
        // System.out.println(ob1.equals(ob2)); // false
        // System.out.println(ob1.hashCode());
        MyObject o1 = new MyObject(); // out call inherit obj class by default
        MyObject1 o2 = new MyObject1(); 
        // System.out.println(o1.hashCode());
        System.out.println(o1.toString()); // override toString Method
        System.out.println(o1.equals(o2)); // override equal method
    }
}
