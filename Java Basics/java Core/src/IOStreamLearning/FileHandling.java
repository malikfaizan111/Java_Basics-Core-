package IOStreamLearning;

import java.io.File;

public class FileHandling {
    public static void main(String[] args) throws Exception {
        // select path of any directory on you computer
        File f = new File("C:\\91199\\MSCS\\JAVA\\Java_Basics-Core-\\Java Basics\\java Core\\src\\IOStreamLearning");

        System.out.println(f.isDirectory());
        File list[] = f.listFiles();

        for (File x : list) {
            System.out.println(x.getParent() + " " + x.getName());
        }

    }
}
