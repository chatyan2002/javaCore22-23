package chapter.chapter12.anotation.anotation1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {

    String str();
    int val();

}
