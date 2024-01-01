package DateAndTimeLearning;

import java.util.*;

public class DateDemo {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis() / 1000); // seconds
        System.out.println(System.currentTimeMillis() / 1000 / 60); // minutes
        System.out.println(System.currentTimeMillis() / 1000 / 60 / 60); // hours
        System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24); // day
        System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365); // hours
        System.out.println(Long.MAX_VALUE);

        Date a = new Date();
        Date b = new Date("4/15/1998");
        System.out.println(b);
        System.out.println(b.getTime());
        System.out.println(b.getDate());
        System.out.println(b.getDay());
        System.out.println(b.getYear());
        System.out.println(b.getHours());
        System.out.println(b.getMinutes());
        System.out.println(b.getSeconds());
    }
}
