package IOStreamLearning;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class Student {
    int rollno;
    String name;
    String dept;
}

public class DataStream {

    public static void myWrite() throws Exception {
        FileOutputStream fos = new FileOutputStream(
                "C:\\91199\\MSCS\\JAVA\\Java_Basics-Core-\\Java Basics\\java Core\\src\\IOStreamLearning\\Test.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        Student s = new Student();
        s.rollno = 1122;
        s.name = "John wick";
        s.dept = "CS";
        dos.writeInt(s.rollno);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);
        dos.close();
        fos.close();
    }

    public static void myRead() throws Exception {
        FileInputStream fis = new FileInputStream(
                "C:\\91199\\MSCS\\JAVA\\Java_Basics-Core-\\Java Basics\\java Core\\src\\IOStreamLearning\\Test.txt");
        DataInputStream dis = new DataInputStream(fis);
        Student s = new Student();

        s.rollno = dis.readInt();
        s.name = dis.readUTF();
        s.dept = dis.readUTF();
        dis.close();
        fis.close();
    }

    public static void main(String[] args) throws Exception{
        DataStream.myWrite();
        DataStream.myRead();
    }
}
