package JavaLangPackage;

public class FloatWrapper {
    public static void main(String[] args) {
        float a = 12.5f;
        Float b = 12.5f;
        Float c = 12.5f/0;
        System.out.println(b.equals(a));
        System.out.println(c.isInfinite());
        System.out.println(Float.POSITIVE_INFINITY == c);
        System.out.println(Float.NEGATIVE_INFINITY == c);

        // NAN (not a number)
        double z = Math.sqrt(-1); // typecase double to float (float)Math.sqrt(-1);
        System.out.println(Double.isNaN(z));
    }
}
