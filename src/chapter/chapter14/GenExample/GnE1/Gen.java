package chapter.chapter14.GenExample.GnE1;

public class Gen<T> {

    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("type T = " + ob.getClass().getName());
    }
}


