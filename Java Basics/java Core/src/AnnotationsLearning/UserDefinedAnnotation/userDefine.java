package AnnotationsLearning.UserDefinedAnnotation;

import java.lang.annotation.*;;
/**
 * InneruserDefine
 */
@interface MyAnno {
    String name(); // this is meta is element(methods)
    String project();
    String date() default "today";
    String version() default "13";
}

@MyAnno(name = "faizan",project = "Bank",date = "1/1/2000",version = "21")
public class userDefine {
    int data; // instance variable;
    public static void main(String[] args) {
        int x;
    }
}

// other in-build Annotations are:
// 1) Retention
// 2) Documented
// 3) Target
// 4) Inherited
// 5) Repeatable