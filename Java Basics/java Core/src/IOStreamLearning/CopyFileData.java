package IOStreamLearning;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class CopyFileData {
        public static void main(String[] args) throws Exception
    {
        
        FileInputStream fis1=new FileInputStream("C:/91199/MSCS/JAVA/Java_Basics-Core-/Java Basics/java Core/src/IOStreamLearning/Source1.txt");
        FileInputStream fis2=new FileInputStream("C:/91199/MSCS/JAVA/Java_Basics-Core-/Java Basics/java Core/src/IOStreamLearning/Source2.txt");
        
        FileOutputStream fos=new FileOutputStream("C:/91199/MSCS/JAVA/Java_Basics-Core-/Java Basics/java Core/src/IOStreamLearning/Destination.txt");
                
        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
        
        
        int b;
        while((b=sis.read())!=-1)
        {
            
            fos.write(b);
        }
        
        sis.close();
        fis1.close();
        fis2.close();
        fos.close();
        
    }   
}
