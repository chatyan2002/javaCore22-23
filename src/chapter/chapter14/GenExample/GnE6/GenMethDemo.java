package chapter.chapter14.GenExample.GnE6;

public class GenMethDemo {

    static <T extends Comparable<T>, V extends T>
    boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i]))
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};

        if (isIn(2, nums))
            System.out.println("number 2 contained to nums array");
        if (!isIn(7, nums))
            System.out.println("number 7 absent to nums array");
        System.out.println();

        String strs[] = {"one", "two", "three",
                "four", "five"};

        if (isIn("two", strs))
            System.out.println("two contained to strs array");
        if (!isIn("seven", strs))
            System.out.println("seven absent strs array");
    }
}
