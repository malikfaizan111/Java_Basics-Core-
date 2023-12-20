package AnnotationsLearning.BuildInAnnotation;

class A {
    public void display() {

    }
}

class B extends A {
    @Override
    public void display() {

    }

    @Deprecated
    public void show() {

    }

}

public class buildIn {

    public static void main(String[] args) {
        int i;
        @SuppressWarnings("deprecation") // supress deprecation warning by using this notation

        B b = new B();

        b.show();
    }
}

// @Override
// @Deprecated
// @FunctionalInterface
// @SuppressWarnings
// @SafeVarargs