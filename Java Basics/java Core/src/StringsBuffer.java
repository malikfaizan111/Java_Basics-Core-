public class StringsBuffer {
    // immutable
    public static void main(String ...args){
        StringBuffer str = new StringBuffer("WELCOME");
        System.out.println(str);
        System.out.println(str.append(" to Java"));
        System.out.println(str.insert(4,"HOW"));
        System.out.println(str.delete(4,7));
//        System.out.println(str.reverse());
        System.out.println(str.length());
        System.out.println(str.indexOf("W"));
        System.out.println(str.charAt(0));
        System.out.println(str.substring(5));
        System.out.println(str.subSequence(11,15));
        System.out.println(str);
    }

}
