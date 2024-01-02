package CollectionFramework;

import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10, 30, 50, 70, 10, 40));
        Collection<Integer> coll = new TreeSet<>(List.of(10, 30, 50, 70, 10, 40)); // collection reference
                SortedSet<Integer> ss = new TreeSet<>(List.of(10,30,50,70,10,40)); // sorted set reference
        ts.add(25);
        // System.out.println(ts.ceiling(55));
        System.out.println(ts.ceiling(55));
        System.out.println(ts);
    }
}
