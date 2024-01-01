package GenericLearning;

@SuppressWarnings("unchecked")
// class MultiParam<T,K>
class MultiParam<T> {
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

// sub class generic class

class MyArray2<T> extends MultiParam<T> {

}

public class MultipleParamter {

    public static void main(String[] args) {
        // MultiParam ma = new MultiParam<>();
        // ma.append(10);
        // ma.append(20);
        // ma.append("string also");
        // ma.display();

        MyArray2 ma = new MyArray2<>();
        ma.append(10);
        ma.append(20);
        ma.append("string also");
        ma.display();
    }
}
