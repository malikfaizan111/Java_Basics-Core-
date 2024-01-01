package NetworkProgramming;

import java.net.*;
import java.io.*;

public class ReverseEcho {
    public static void main(String[] args)throws Exception{
        ServerSocket ss = new ServerSocket(2000);
        Socket stk = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
         StringBuilder sb;

        do{
            msg = br.readLine();
            sb = new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();
            ps.println(msg);
        }
        while(!msg.equals("dne"));
    }
}


class Client {
    public static void main(String[] args)throws Exception{
        // localhost
        Socket stk = new Socket("192.168.204.124",2000);
   
        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;

        do{
            msg = keyb.readLine();
            ps.println(msg);
            msg = br.readLine();
            System.out.println("From Server: "+msg);
        }
        while(!msg.equals("end"));
        stk.close();
    }
}
