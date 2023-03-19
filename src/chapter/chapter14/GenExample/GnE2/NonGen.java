package chapter.chapter14.GenExample.GnE2;

public class NonGen {

    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getOb() {
         return ob;
    }

    void showType(){
        System.out.println("obyekt ob applies " + ob.getClass().getName());
    }
}
