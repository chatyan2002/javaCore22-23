package chapter.chapter12.anotation;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {

    String str();
    int val();
}
