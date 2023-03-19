package chapter.chapter12.anotation.anotation1;

import java.lang.annotation.*;
import java.lang.reflect.*;

@What(description = "anotation for class text")
@MyAnno(str = "Meta2", val = 99)
class Meta2 {

    @What(description = "anotation for class method")
    @MyAnno(str = "testing", val = 100)

    public static void myMeth() {
        Meta2 ob = new Meta2();

        try {
            Annotation annos[] = ob.getClass().getAnnotations();

            System.out.println("all anotataion for Meta2 class!");
            for (Annotation a : annos) {
                System.out.println(a);
                System.out.println();

                Method m = ob.getClass().getMethod("myMeth");
                annos = m.getAnnotations();
            }
            System.out.println("all anotation for myMeth() method:");
            for (Annotation b : annos) {
                System.out.println(b);
            }

        } catch (NoSuchMethodException exc) {
            System.out.println("No Method!");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }

}
