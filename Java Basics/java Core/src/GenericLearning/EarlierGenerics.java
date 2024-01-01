package GenericLearning;

import java.util.ArrayList;

public class EarlierGenerics<T> {
     ArrayList<T> data;

    public EarlierGenerics() {
        // Initializing an ArrayList
        data = new ArrayList<>();
    }

    public static void main(String[] args) {
        /*
         * Object obj = new String("Hello");
         * //obj = new Integer(10);
         * String str = (String) obj;
         * System.out.println(str);
         */

        /*
         * Object objArr[] = new Object[3];
         * objArr[0] = "hi";
         * objArr[1] = "bye";
         * objArr[2] = new Integer(10);
         * 
         * String stri;
         * 
         * for(int i=0;i<3;i++){
         * stri = (String)objArr[i];
         * System.out.println(stri);
         * }
         */
        EarlierGenerics<String> gd = new EarlierGenerics<>();
        gd.data.add("Hi");
        gd.data.add("Bye");
        
        System.out.println(gd.data.get(0)); // This will print "Hi"
        System.out.println(gd.data.get(1)); // This will print "Bye"
    }
}
