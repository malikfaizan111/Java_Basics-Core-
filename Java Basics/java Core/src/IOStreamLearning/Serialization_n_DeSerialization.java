package IOStreamLearning;

import java.io.*;

class Chacha implements Serializable {
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data = 10;
    public transient int t;

    public Chacha() {

    }

    public Chacha(int r, String n, float a, String d) {
        rollno = r;
        name = n;
        avg = a;
        dept = d;
        Data = 500;
        t = 500;
    }

    public String toString() {
        return "\nChacha Details\n" +
                "\nRoll " + rollno +
                "\nName " + name +
                "\nAverage " + avg +
                "\nDept " + dept +
                "\nData " + Data +
                "\nTransient " + t + "\n";
    }

}

class ObjectDemo {

    public static void outPut() throws Exception {
        FileOutputStream fos = new FileOutputStream("C:\\91199\\MSCS\\JAVA\\Java_Basics-Core-\\Java Basics\\java Core\\src\\IOStreamLearning\\Test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Chacha s = new Chacha(10, "John", 89.9f, "CSE");

        oos.writeObject(s);

        fos.close();
        oos.close();

    }

    public static void input() throws Exception {
  FileInputStream fis = new FileInputStream("C:\\91199\\MSCS\\JAVA\\Java_Basics-Core-\\Java Basics\\java Core\\src\\IOStreamLearning\\Test.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Chacha s = (Chacha) ois.readObject();

        System.out.println(s);

        fis.close();
        ois.close();
    }
}

public class Serialization_n_DeSerialization {
    public static void main(String[] args) throws Exception {
        ObjectDemo.input();
    }
}
