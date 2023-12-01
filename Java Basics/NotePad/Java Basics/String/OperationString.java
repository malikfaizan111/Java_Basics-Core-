public class OperationString {
    public static void main(String[] args) {
        String str1 = "Wizarding";
        String str2 = "World";
        String result = str1 + " " + str2; // Concatenation

        boolean isEqual = str1.equals(str2); // Checks for exact equality
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // Ignores case while checking
        System.out.println("isEqual Only Case: ("+isEqual + ") isEqual Ignorance Case: (" + isEqualIgnoreCase + ")");

        int length = result.length();
        System.out.println("String result: "+length);

        String subStr = result.substring(7); // starting from 7 not giving ending Index;
        System.out.println("Sub  String of result: "+subStr);

        String upperCase = result.toUpperCase(); // Convert to uppercase
        String lowerCase = result.toLowerCase(); // Convert to lowercase

        System.out.println("lowercase: ("+upperCase + ") uppercase: ("+ lowerCase + ")");

        String trimmedStr = result.trim(); // Removes leading and trailing spaces
        System.out.println("Remove White spaces: "+trimmedStr);

        String replacedStr = result.replace("Wizarding", "Voldamort"); // Replaces "Hello" with "Hi"
        System.out.println("New String: "+replacedStr);

        String str = "Apple,Orange,Mango";
        String[] arr = str.split(",");
        for(String item:arr){
        System.out.println("String Array: "+item);
        }

        boolean contains = str.contains("Mango"); // Checks if "Mango" is present
        System.out.println("String Contains Mango: " + contains);
    }
}
