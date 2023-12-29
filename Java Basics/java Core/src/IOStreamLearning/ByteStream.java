package IOStreamLearning;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.FileOutputStream;

public class ByteStream {

    public static void byteInputStream() throws Exception {
        byte b[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };

        ByteArrayInputStream bis = new ByteArrayInputStream(b);

        // int x;
        // while ((x=bis.read()) != -1) {
        // System.out.print((char) x);
        // }
        String str = new String(bis.readAllBytes());
        System.out.println(bis.markSupported());
        System.out.println(str);
        bis.close();
    }


        public static void byteOutputStream() throws Exception {
        int byteArraySize = 20;
        ByteArrayOutputStream bos = new ByteArrayOutputStream(byteArraySize);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        // byte b[] = bos.toByteArray();
        // for(byte x:b){
        //     System.out.println(x);
        // }

        bos.writeTo(new FileOutputStream("C:/91199/MSCS/JAVA/Java_Basics-Core-/Java Basics/java Core/src/IOStreamLearning/Test.txt"));
        bos.close();
    }

    public static void main(String[] args) throws Exception {
        // ByteDemo.byteOutputStream();

        char c[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };

        CharArrayReader cr = new CharArrayReader(c);
        int x;
        while((x = cr.read()) != -1){
            System.out.print((char)x);
        }
        cr.close();
    }
}
