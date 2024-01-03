package CollectionFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyDemo {
    public static void main(String[] args) throws Exception {
           Properties p=new Properties();
        
        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Windows10");
        p.setProperty("Model", "Latitude");
        
        
        p.storeToXML(new FileOutputStream("C:\\91199\\MSCS\\JAVA\\Java_Basics-Core-\\Java Basics\\java Core\\src\\CollectionFramework\\MyData.xml"), "Laptop");
        
        
        p.load(new FileInputStream("C:\\91199\\MSCS\\JAVA\\Java_Basics-Core-\\Java Basics\\java Core\\src\\CollectionFramework\\MyData.txt"));
        
        System.out.println(p);
    }
}
