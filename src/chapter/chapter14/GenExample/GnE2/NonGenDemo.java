package chapter.chapter14.GenExample.GnE2;

public class NonGenDemo {
    public static void main(String[] args) {

        NonGen iOb;

        iOb = new NonGen(88);
        iOb.showType();
        int v = (Integer) iOb.getOb();
        System.out.println("meaning: " + v);
        System.out.println();

        NonGen strOb = new NonGen("test without generalizations");
        strOb.showType();

        String str = (String) strOb.getOb();
        System.out.println("meaning: " + str);

        iOb = strOb;
        v = (Integer) iOb.getOb();
    }
}