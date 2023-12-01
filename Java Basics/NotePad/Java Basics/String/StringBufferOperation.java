public class StringBufferOperation {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer();

        str.append("Ron Weasly");
        System.out.println("String Buffer: " + str);

        str.append(" From ").append("Wizading World");

        str.insert(str.length(), " -----");

        System.out.println("After Append and Insert String Buffer: " + str);

        str.replace(30, str.length(), "");
        System.out.println("replace: " + str);


        str.delete(0, 4); // Deleting characters within a range
        System.out.println("delete: " + str);
        str.deleteCharAt(0);
        System.out.println("delete char At: " + str);
        System.out.println("reverse = "+str.reverse());
        System.out.println("indexof  = "+str.indexOf("morF"));


        // ----------------------------------------------------------------
        StringBuffer string = new StringBuffer("WELCOME");
        System.out.println(string);
        System.out.println(string.append(" to Java"));
        System.out.println(string.insert(4,"HOW"));
        System.out.println(string.delete(4,7));
//        System.out.println(string.reverse());
        System.out.println(string.length());
        System.out.println(string.indexOf("W"));
        System.out.println(string.charAt(0));
        System.out.println(string.substring(5));
        System.out.println(string.subSequence(11,15));
        System.out.println(str);
    }
}
