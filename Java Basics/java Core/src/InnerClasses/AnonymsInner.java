package InnerClasses;

/**
 * InnerAnonymsInner
 */
interface InnerAnonymsInner {
    public void display();
}
public class AnonymsInner {

    public static void anonyMethod(){
        new InnerAnonymsInner() {
            public void display(){
                System.out.println("Hello Anonyms Inner Class");
            }
        }.display();;
    }

    public static void main(String[] args) {
        AnonymsInner.anonyMethod();
    }
    
}
