package IOStreamLearning;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class FileStream {

    public static void fileOut(String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            String str = "Learn Java Programming";
            // fos.write(str.getBytes()); // get all bytes

            byte b[] = str.getBytes(); // get 1 by 1 byte

            // for(byte x:b){
            // fos.write(x);
            // }

            fos.write(b, 6, str.length() - 6);

            fos.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void fileIn(String path) {

        try (FileInputStream fis = new FileInputStream(path)) {
            
            byte b[] = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);
            System.out.println(str);
                      fis.close();

        } catch (Exception E) {

        }
    }

    //  parts of Character Stream
       public static void fileReader(String path) {

        try (FileReader fr = new FileReader(path)) {
            int x;
            while ((x = fr.read()) != -1) {
                System.out.print((char) x);
            }

            fr.close();

        } catch (Exception E) {

        }
    }

    public static void main(String[] args) {
        String FilePath = "C:/91199/MSCS/JAVA/Java_Basics-Core-/Java Basics/java Core/src/IOStreamLearning/Test.txt";
        // FileStream.fileOut(FilePath);
        // FileStream.fileIn(FilePath);
        FileStream.fileReader(FilePath);
    }
}
