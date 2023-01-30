package chapter7;

public class OverLoadDemo1 {
    public static void main(String[] args) {

        OverLoad1 ob = new OverLoad1();
        int i = 88;

        ob.test();
        ob.test(10, 20);
        ob.test(i);
        ob.test(123.2);


    }
}
