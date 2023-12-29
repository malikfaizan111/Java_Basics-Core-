package IOStreamLearning;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Candidate implements Serializable{
    String custID;
    String name;
    String phno;

    static int count = 0;

    Candidate(){

    }

    Candidate(String n, String p){
        custID = "C" + count;
        count++;
        name = n;
        phno = p;
    }

    public String toString()
    {
        return "Candidate ID:" + custID + "\\nName: "+name+"\nPhno: "+phno+"\n";
    }
}
public class SerializeChallenge {
    // public static void main(String[] args) throws Exception{
    //     Candidate list[] = {new Candidate("Smith","42352525"),new Candidate("john","33523235325"), new Candidate("Ajay","23235235235235")};
    //     FileOutputStream fos = new FileOutputStream("C:\\91199\\MSCS\\JAVA\\Java_Basics-Core-\\Java Basics\\java Core\\src\\IOStreamLearning\\Customer.txt");
    //     ObjectOutputStream oos = new ObjectOutputStream(fos);

    //     oos.writeInt(list.length);
    //     for(Candidate c: list){
    //         oos.writeObject(c);
    //     }
    //     oos.close();
    //     fos.close();

    // }

    public static void main(String[] args) throws Exception{
        java.util.Scanner sc = new java.util.Scanner(System.in);
        FileInputStream fis = new FileInputStream("C:\\91199\\MSCS\\JAVA\\Java_Basics-Core-\\Java Basics\\java Core\\src\\IOStreamLearning\\Customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int length = ois.readInt();

        Candidate list[] = new Candidate[length];

        for(int i=0;i<length;i++){
            list[i] = (Candidate)ois.readObject();
        }
        System.out.println("Enter Name of Candidate");
        String name = sc.nextLine();

        for(int i=0;i<length;i++){
            if(name.equalsIgnoreCase(list[i].name))
            {
                System.out.println(list[i]);
            }
        }

        ois.close();
        fis.close();
    }
}
