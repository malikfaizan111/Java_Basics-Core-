package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOperation {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        integerList.add(Integer.parseInt("123"));
        integerList.add(234);
        integerList.add(567);
        integerList.add(8910);

        System.out.println("Array List Integer" + integerList);


        ArrayList<String> StringList = new ArrayList<String>();
        ArrayList<Character> charList = new ArrayList<Character>();

        // Creating an ArrayList with initial elements
        ArrayList<Character> charListInitial = new ArrayList<>(List.of('a', 'b', 'c'));

        int value = integerList.get(1); // Getting an element at a specific index

        int index = integerList.indexOf(20); // Finding index of an element

        boolean contains = integerList.contains(30); // Checking if list contains an element
        
        integerList.set(2, 25); // Updating an element at a specific index

        integerList.remove(1); // Removing an element by index

        boolean removed = integerList.remove(Integer.valueOf(20)); // Removing a specific element
        
        integerList.clear(); // Removing all elements from the list
    }

}
