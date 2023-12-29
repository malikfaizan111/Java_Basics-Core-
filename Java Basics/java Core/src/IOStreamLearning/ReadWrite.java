package IOStreamLearning;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Student{
    int rollno;
    String name;
    String dept;
}
public class ReadWrite {

    public static void myWrite() throws Exception{
    FileOutputStream fos = new FileOutputStream("C:\\91199\\MSCS\\JAVA\\Java_Basics-Core-\\Java Basics\\java Core\\src\\IOStreamLearning\\Test.txt");
    PrintStream ps = new PrintStream(fos);
    Student s = new Student();
    s.rollno = 10; s.name = "John"; s.dept="CS";
    ps.println(s.rollno);
    ps.println(s.name);
    ps.println(s.dept);
    ps.close();
    fos.close();
}

    public static void myRead() throws Exception{
    FileInputStream fis = new FileInputStream("C:\\91199\\MSCS\\JAVA\\Java_Basics-Core-\\Java Basics\\java Core\\src\\IOStreamLearning\\Test.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(fis));
    Student s = new Student();
   
    s.rollno =Integer.parseInt(br.readLine());
    s.name = br.readLine();
    s.dept = br.readLine();
    br.close();
    fis.close();
}
    public static void main(String[] args) throws Exception {
        ReadWrite.myWrite();
        ReadWrite.myRead();
    }
}
