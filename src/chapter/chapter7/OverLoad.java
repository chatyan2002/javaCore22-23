package chapter.chapter7;

public class OverLoad {

    void test() {
        System.out.println("datarkutyun");
    }

    void test(int a, int b) {
        System.out.println("a and b : " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a : " + a);
        return a * a;
    }

}
