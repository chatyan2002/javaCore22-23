package chapter.chapter14.GenExample.GnE3;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj =
                new TwoGen<Integer, String>(88, "Genericks");
        tgObj.showTypes();

        int v = tgObj.getOb1();
        System.out.println("applies: " + v);

        String str = tgObj.getOb2();
        System.out.println("applies: " + str);
    }
}
