package IOStreamLearning;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class BufferedStream {
    static FileInputStream fis;
    static BufferedInputStream bis;

    static FileReader fr;
    static BufferedReader br;

    public static void BufferInptStream(String path) throws Exception {
        fis = new FileInputStream(path);
        bis = new BufferedInputStream(fis);

    }

    public static void BufferOutputStream(String path) throws Exception {
        fr = new FileReader(path);
        br = new BufferedReader(fr);

    }

    public static void main(String[] args) throws Exception {
        String File_Path = "C:/91199/MSCS/JAVA/Java_Basics-Core-/Java Basics/java Core/src/IOStreamLearning/Test.txt";
        BufferedStream.BufferInptStream(File_Path);

        System.out.println("File " + fis.markSupported()); // false
        System.out.println("Buffer " + bis.markSupported()); // true;

        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        bis.mark(10);

        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        bis.reset();
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());

        BufferedStream.BufferOutputStream(File_Path);
                System.out.println((char) br.read());
        System.out.println((char) br.read());
        System.out.println((char) br.read());
        br.mark(10);

        System.out.println((char) br.read());
        System.out.println((char) br.read());
        br.reset();
        System.out.println((char) br.read());
        System.out.println((char) br.read());

        System.err.println("String"+ br.readLine()); 
    }
}
