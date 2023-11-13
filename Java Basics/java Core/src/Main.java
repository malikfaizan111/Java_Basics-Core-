//import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String... args)    {
//        System.out.println("Your first argument is: "+args[0]);
//        try(PrintStream  printStream = new PrintStream(System.out)){
//            printStream.println("Your first argument is your_variable_or_value");
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }

//        boolean isAcitve = false;
//        byte bytii = 100; // 0 - 99 ( 1 byte )
//        short shortii = 10000; // 0 - 9999 ( 2 byte )
//        int intii = 1000000000; // 0 - 999999999 (4byte)
//        long longi = 1000000000; // 0 - 999999999 ( 8 byte )
//        float f1 = 235.25f; // f is necessary for float value
//        double doublii = 0.356;
//
//        int x = 10;
////      --x;
////      System.out.println("postFix\n"+ x );
//        System.out.println(++x); // 11
//        System.out.println(x--); // 11 print but decrement -1
//        System.out.println(x++); // 10 print but increment +1
//        System.out.println(--x); // 10 print 11 - 1 => 10
//        int a = 10;
//        System.out.println(a++ +  ++a);
//
//        int unary = 1;
//        int negNum = -1;
//
//        boolean c = true;
//        boolean d = false;
//
//        System.out.println(~unary);
//        System.out.println(~negNum);

//        System.out.println(10*10/5+3-1*4/2);

//          System.out.println(10 << 2); // 10 * 2 ^ 2 = 10 * 4 = 40;
//          System.out.println(10 << 1); // move value from right side; 10 * 5 ^ 5 = 10 * 25 =>
//          System.out.println(100 >> 5); // 100 ^ 5 * 5 => 100/5 ^ 5;

//            converstion

//        int a = 12;
//        System.out.println(String.valueOf(a));
//        String sa = "" + a;
//        System.out.println(sa);
//        String str = "12";
//        System.out.println(Integer.parseInt(str));
//        System.out.println(Long.parseLong(str));
//        System.out.println(Short.parseShort(str));

//       Console Input

//        String name;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a Name: ");
//        name = scan.nextLine(); // scan.next() only get until the space
//        System.out.print("Display Name: " + name);

        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter a Name (or type 'exit' to quit): ");
                String name = scan.nextLine();

                if (name.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting the program.");
                    break; // Exit the loop if the user types 'exit'
                }

                System.out.println("Display Name: " + name);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception details to the console
        }
    }
}
