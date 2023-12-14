package ExceptionLearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResources {

    static void Divide() throws Exception {
        try(FileInputStream fi = new FileInputStream("C:\\91199\\MSCS\\JAVA\\Java_Basics-Core-\\Java Basics\\java Core\\src\\ExceptionLearning\\Test.txt"); Scanner sc = new Scanner(fi) ) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / c);
        }

    }

    public static void main(String[] args) throws Exception {
        try {
            Divide();
        } catch (Exception e) {
            System.out.println(e);
        }

        // int x = sc.nextInt();
        // System.out.println(x);
    }
}
