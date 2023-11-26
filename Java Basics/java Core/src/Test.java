import java.io.*;

public class Test {

    public void ioStream() throws IOException{
        // In System.in (Input stream from keyboard)
        InputStreamReader io = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(io);
        int a = Integer.parseInt(br.readLine());
        String str = br.readLine();
        float b = Float.parseFloat(br.readLine());
        System.out.println("Int " + a + ":" + "String " + ":" +  str + "Float " + ":" +  b );
    }

    public void fileReader(String path) throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String str = br.readLine();
        System.out.println("String " + ":" +  str);
    }
    public static void main(String args[]) {

    }


}
