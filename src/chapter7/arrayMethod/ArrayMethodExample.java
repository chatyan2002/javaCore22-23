package chapter7.arrayMethod;

public class ArrayMethodExample {
    static void vaTest(int... v) {
        System.out.println(v.length);
        for (int i : v) {
            System.out.println(i + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
