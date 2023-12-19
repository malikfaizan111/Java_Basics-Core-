package JavaLangPackage;

public class WrapperClasses {

    public static void main(String[] args) {
        // int i = 10; // primitive or buildIn datatypes
        // we want primitive for Classes
        // Integer i = new Integer(); // old and depreciated method
        Integer a = Integer.valueOf(10); // better way

        Byte c = 15;
        Byte d = Byte.valueOf("15");
        Byte bb = 15;
        Byte e = Byte.valueOf(bb);

        Short f = Short.valueOf("123");

        Float g = 12.4f;

        Double i = Double.valueOf(123.456);

        Character k = Character.valueOf('A');

        Boolean l = Boolean.valueOf("true");

        Float h = Float.valueOf("123.5");
        float x = h.floatValue(); // unboxing
        float y = h; // automatically unboxing

        int m = 10;
        Integer n = m; // auto boxing
        Integer o = Integer.valueOf(m); // boxing
        int p = o.intValue(); // manual unboxing
    }
}
