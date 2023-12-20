package AnnotationsLearning.BuildInAnnotation;

import java.lang.annotation.*;;

// @Retention(RetentionPolicy.CLASS)
// @Retention(RetentionPolicy.SOURCE)
// @Retention(RetentionPolicy.RUNTIME)

// @Documented // add out custom annotation in java doc

// @Target(value = {ElementType.LOCAL_VARIABLE,ElementType.METHOD})// this custom annotation is only available for Local Variable and Methods

// @Inherited  working on all sub classes

// @Repeatable(MyAnno.class) use multiple times
@interface MyAnno {
    String name(); // this is meta is element(methods)

    String project();

    String date() default "today";

    String version() default "13";
}

public class otherBuildIn {
    int data; // instance variable;

    @MyAnno(name = "faizan", project = "Bank", date = "1/1/2000", version = "21")
    public static void main(String[] args) {
        @MyAnno(name = "faizan", project = "Bank", date = "1/1/2000", version = "21")
        int x;
    }
}
// other in-build Annotations are:
// 1) Retention
// 2) Documented
// 3) Target
// 4) Inherited
// 5) Repeatable