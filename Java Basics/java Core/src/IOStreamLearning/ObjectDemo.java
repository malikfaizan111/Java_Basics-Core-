package IOStreamLearning;

import java.io.*;

class Bacha implements Serializable
{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;
    public transient int t;
    
    public Bacha()
    {
        
    }
    public Bacha(int r,String n,float a,String d)
    {
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=500;
    }
    
    public String toString()
    {
        return "\nBacha Details\n"+
                "\nRoll "+rollno+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }
    
}

public class ObjectDemo 
{
   /*  public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("C:\\91199\\MSCS\\JAVA\\Java_Basics-Core-\\Java Basics\\java Core\\src\\IOStreamLearning\\Test.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        Bacha s=new Bacha(10,"John",89.9f,"CSE");
        
        oos.writeObject(s);
        
        fos.close();
        oos.close();
        
    }
   */
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("C:\\91199\\MSCS\\JAVA\\Java_Basics-Core-\\Java Basics\\java Core\\src\\IOStreamLearning\\Test.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        Bacha s=(Bacha)ois.readObject();
        
        System.out.println(s);
        
        fis.close();
        ois.close();
        
    }
}