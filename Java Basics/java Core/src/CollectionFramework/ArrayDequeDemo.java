package CollectionFramework;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        // dq.pollLast();  this add last and poll last act as stack
          // dq.pollLast();  this add last and poll first act as queue
        // dq.forEach(System.out::println);


        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);
        dq.forEach(System.out::println);
    }
}
