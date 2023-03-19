package chapter.chapter12;

import java.lang.reflect.Method;


public class Meth {
    @MyAnno(str = "primer anotaci", val = 100)
    public static void myMetoh() {
        Meth ob = new Meth();
        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMetoh");
            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exs) {
            System.out.println("Metod ne naiden");
        }

    }

    @Override
    public String toString() {
        return "Meth{}";
    }

    public static void main(String[] args) {
        myMetoh();
        Meth m = new Meth();

    }
}
