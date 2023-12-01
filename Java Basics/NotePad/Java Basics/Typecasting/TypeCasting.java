package Typecasting;

public class TypeCasting {

    public static void main(String[] args) {
        int numInt = 100;
        long numLong = numInt; // implicity Typecasting
        System.out.println("int --> long: " + numLong);

        long numLong1 = 1234567892;
        int num1Int = (int) numLong1; // Explicit Typecasting from double to int
        System.out.println("long --> int: " + num1Int);

        int numIntOnly = 100223311;
        double numDouble = numIntOnly; // implicity Typecasting
        System.out.println("int --> double: " + numDouble);

        Object[] objArr = new String[5];

        objArr[0] = "Apple";
        objArr[1] = "Banana";
        objArr[2] = "Cheeku";
        objArr[3] = "Deja voo";
        objArr[4] = "Envelop";

        for (Object item : objArr) {
            System.out.println("index= " + item);
        }

        String[] strArr = (String[]) objArr;

        for (String item : strArr) {
            System.out.println("strArr index= " + item);
        }

        int a = 12;
        System.out.println(String.valueOf(a));
        String sa = "" + a;
        System.out.println(sa);
        String str = "12";
        System.out.println(Integer.parseInt(str));
        System.out.println(Long.parseLong(str));
        System.out.println(Short.parseShort(str));
    }
}
