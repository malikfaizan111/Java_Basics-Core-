package CollectionFramework;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class LinkedHashSet {
    public static void main(String[] args) {
               java.util.LinkedHashSet<String> lhs=new java.util.LinkedHashSet<>(10);
        
        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("K");
        lhs.add("B");
        lhs.add("G");
        lhs.add("B");
        
        Iterator<String> itr=lhs.iterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        Hashtable ht=new Hashtable(10);
    }
}
