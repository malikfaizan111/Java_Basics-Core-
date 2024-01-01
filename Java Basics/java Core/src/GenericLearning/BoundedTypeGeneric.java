package GenericLearning;

// class Animal {}
// class Tiger extends Animal {}
// class Loin extends Animal {}
// class Liger<T extends Animal> {}

interface Animal {}
class Tiger implements Animal {}
class Loin implements Animal {}
class Liger<T extends Animal> {} // interface uses extends too in Generics

@SuppressWarnings("unchecked")
class ArrayBound<T extends Number> {
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

public class BoundedTypeGeneric {
    public static void main(String[] args) {
        // ArrayBound ma = new ArrayBound<>();
        ArrayBound<Integer> numOnly = new ArrayBound<>();
        // ArrayBound<String> stringOnly = new ArrayBound<>(); Not Accept String Because
        // of Extend from Numbers
        numOnly.append(10);
        numOnly.append(20);
        // ma.append("string also");
        numOnly.display();

        Liger<Animal> lig = new Liger<>();
        Liger<Tiger> Tig = new Liger<>();
        Liger<Loin> Lion = new Liger<>();
    }
}
