package GenericLearning;

class AA {
}

class BB extends AA {
}

class CC extends BB {
}

@SuppressWarnings("unchecked")
class MyArraya<T> {
    T A[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        A[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }
}

public class GenericMethods {
    // static <E> void show(E[] list){
    // static <E> void show(E... list) {
    // for (E x : list) {
    // System.out.println(x);
    // }
    // }

    // static <E extends Number> void displayNum(E... list) {
    // for (E x : list) {
    // System.out.println(x);
    // }
    // }

    // static void fun(MyArraya<? extends Number> obj){

    static void fun(MyArraya<?> obj) { // wildcard for any type
        obj.display();
    }

    static void funA(MyArraya<? super BB> obj) { // wildcard for any type
        obj.display();
    }

    public static void main(String[] args) {
        // show(new String[]{"Hi","Go","Bye"});
        // show(new Integer[] {10,20,30,40});
        // show("Hi", "Go", "Bye");
        // show(10, 20, 30, 40);

        MyArraya<String> ma1 = new MyArraya<>();
        ma1.append("Hi");
        ma1.append("Bye");

        MyArraya<Integer> ma2 = new MyArraya<>();
        ma2.append(10);
        ma2.append(20);

        // fun(ma1);
        // fun(ma2);

        MyArraya<BB> ma3 = new MyArraya<>();
        MyArraya<AA> ma4 = new MyArraya<>();
        funA(ma3);
        funA(ma4);
    }
}
