package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        // System.out.println(List.of(50,60,70,80,90));
        ArrayList<Integer> arrList = new ArrayList<>(20);
        ArrayList<Integer> arrList2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));
        arrList.add(10);
        arrList.add(0, 5);
        arrList.addAll(arrList2);
        // System.out.println(arrList.get(5));
        // arrList.addAll(1,arrList2);
        // System.out.println(arrList.contains(50));
        // System.out.println(arrList.indexOf(70));
        // arrList.add(3, 70);
        // System.out.println(arrList.lastIndexOf(70));
        // arrList.set(2,15);
        // System.out.println(arrList);

        // for(int i=0;i<arrList.size();i++){
        // System.out.println(arrList.get(i));
        // }

        // for (Integer x:arrList) {
        // System.out.println(x);
        // }

        // for (var x : arrList) {
        // System.out.println(x);
        // }

        // arrList.forEach((x) -> {
        // System.out.println(x); // ->
        // });

        // arrList.forEach(System.out::println);
        arrList.forEach(n->show(n));
        // Iterator<Integer> it = arrList.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }

        // ListIterator<Integer> it = arrList.listIterator();
        // while (it.hasNext()) { // has previous also and next too.
        // System.out.println(it.next());
        // }

        // for (ListIterator<Integer> it = arrList.listIterator(); it.hasNext();) {
        //     System.out.println(it.next());
        // }
    }

    static void show(int n){
        if(n>60)
        System.out.println(n);
    }
}
