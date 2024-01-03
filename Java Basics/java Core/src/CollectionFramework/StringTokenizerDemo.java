package CollectionFramework;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) throws Exception {
               // File path must be valid
        FileInputStream fis=new FileInputStream("C:\\91199\\MSCS\\JAVA\\Java_Basics-Core-\\Java Basics\\java Core\\src\\CollectionFramework\\MyData.txt");
        byte b[]=new byte[fis.available()];
        fis.read(b);
        
        String data=new String(b);

        //String data="name=Vijay address=delhi country=india dept=cse";
    
        
        StringTokenizer stk=new StringTokenizer(data,",");
        
        String s;
        ArrayList<Integer> al=new ArrayList<>();
        
        while(stk.hasMoreTokens())
        {
            s=stk.nextToken();
            al.add(Integer.valueOf(s));
            
        }
        
        System.out.println(al);
    }
}
