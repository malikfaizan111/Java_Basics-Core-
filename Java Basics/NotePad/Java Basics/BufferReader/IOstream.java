package BufferReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOstream {

    void ioStream() throws IOException{
        InputStreamReader io = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(io);

        // Reading an integer input
        System.out.println("Enter an integer:");
        int a = Integer.parseInt(br.readLine());

        // Reading a string input
        System.out.println("Enter a string:");
        String str = br.readLine();

        // Reading a float input
        System.out.println("Enter a float:");
        float b = Float.parseFloat(br.readLine());

        // Printing the inputs
        System.out.println("Int: " + a + ", String: " + str + ", Float: " + b);

        // Close the BufferedReader and InputStreamReader
        br.close();
        io.close();
    }

    void fileReader(String path) throws IOException{
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String str = br.readLine();
        System.out.println("Read Data From File: " + str );
        br.close();
        fr.close();
    }

    public static void main(String[] args) {
        IOstream stream = new IOstream();
        // try{
        //     stream.ioStream();
        // }
        // catch(Exception e){
            // System.err.println("Exception case" + e);
        // }
        try{
            stream.fileReader("C:\\91199\\MSCS\\JAVA\\Java Basics\\BufferReader\\file.txt");
            
        }
        catch(Exception e){
        System.err.println("Exception case:" + e);
        }
    }
}

