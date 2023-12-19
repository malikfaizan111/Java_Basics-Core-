package JavaLangPackage;

public class IntegerWrapper {
    public static void main(String[] args) {
        int m1 = 15;
        Integer m2 = m1;
        System.out.println(m2.compareTo(m1)); // zero(true)
        System.out.println(m2.equals(m1));

        // int wrapper Static method

        Integer m3 = Integer.valueOf("123");
        Integer m4 = Integer.valueOf("1101", 2);
        System.out.println(m4);
        System.out.println(Integer.valueOf("A7", 16));
        Integer m5 = Integer.parseInt("788");
        System.out.println(Integer.toBinaryString(40));
    }
}
