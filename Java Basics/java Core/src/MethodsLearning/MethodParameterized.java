package MethodsLearning;

import java.util.HashMap;
import java.util.Map;

public class MethodParameterized {
    
    static Map<String, Integer> primitive(int a, int b){
        a = 50;
        b = 100;

        Map<String, Integer> result = new HashMap<>();
        result.put("a", a);
        result.put("b", b);
        return result;
    }

    static void getString(String name){
        name = "Hello New " + name;
    }

    static void changeIndexValue(int A[]){
        A[0] = 786;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        Map<String, Integer> resultMap = primitive(a, b);

        System.out.println("Value of a: " + resultMap.get("a"));
        System.out.println("Value of b: " + resultMap.get("b"));

        System.out.println("Value of (a) after Pass and change in method = "+ a);
        System.out.println("Value of (b) after Pass and change in method = "+ b);

        String name = "String";
        getString(name);
        System.out.println(name);

        int A[] = {10,20,30,30};
        changeIndexValue(A);
        for(int Arr: A){
            System.out.println(Arr);
        }
    }
}
