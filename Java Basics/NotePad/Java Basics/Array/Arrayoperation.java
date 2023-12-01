package Array;

import java.util.Scanner;

public class Arrayoperation {
    public static void main(String[] args) {
        // ---------------------------------------------
        int[] intArray = new int[5];
        int[] anotherArray = { 1, 2, 3, 4, 5 };

        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Phython";
        strArray[2] = "JavaScript";

        // ---------------------------------------------

        int size = 5;
        double[] doubleArray = new double[size];
        for (int i = 0; i < size; i++) {
            doubleArray[i] = i * 1.5;
        }

        // --------------------------------------------

        // int[][] twoDArray = {{1,2},{3,4},{5,6}};

        // int[][] jaggedArray = new int[3][];
        // jaggedArray[0] = new int[] { 1, 2, 3 };
        // jaggedArray[1] = new int[] { 4, 5 };
        // jaggedArray[2] = new int[] { 6, 7, 8, 9 };

        // for (int i = 0; i < jaggedArray.length; i++) {
        //     for (int j = 0; j < jaggedArray[i].length; j++) {
        //         System.out.print(jaggedArray[i][j] + " ");
        //     }
        //     System.out.println(); // Move to the next line after printing each row
        // }

        System.out.println("Enter Digit For Tree: ");
        try(Scanner scan = new Scanner(System.in)){
            int digit = scan.nextInt();
            char[][] arr = new char[digit][];
            for(int i = 0; i < digit; i++){
                arr[i] = new char[i + 1];
                for(int j = 0; j< i + 1; j++){
                    arr[i][j] = '*';
                }
            }

                    // Printing the elements of the 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(); // Move to the next line after printing each row
        }
        }
        catch(Exception e){
            e.printStackTrace(); // Print the exception details to the console
        }
        

    }
}
