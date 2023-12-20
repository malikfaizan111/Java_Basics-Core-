
package LamdaLearning;

@FunctionalInterface
interface FuncLamda {
    // public void display(String str);
    public int add(int x, int y);
}

public class ParameterizedLamda {
    public static void main(String[] args) {
        // Lambda Expression
        // FuncLamda m = (s) -> {
        //     System.out.println(s);
        // };

        // m.display("Hello World");
        FuncLamda m =(a,b)->a + b; // automatically return
        // FuncLamda m =(a,b)->{ return a + b;};

        System.out.println(m.add(20, 30));
    }
}
