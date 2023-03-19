package chapter.chapter14.GenExample.GnE1;

import chapter.chapter14.GenExample.GnE1.Gen;

public class GenDemo {

    public static void main(String[] args) {
        Gen<Integer> iob;

        iob = new Gen<Integer>(88);

        iob.showType();

        int v = iob.getOb();
        System.out.println("imast: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<String>("test generick");
        strOb.showType();

        String str = strOb.getOb();
        System.out.println("imast: " + str);
    }

}
