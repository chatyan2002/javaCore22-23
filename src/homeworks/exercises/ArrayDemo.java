package homeworks.exercises;

public class ArrayDemo {
    public static void main(String[] args) {
        Array au = new Array();
        int[] arrayMax = {22, 33, 61, 1, 9, -17, 76, 112, 809, 3};
        int a = au.maxOfArray(arrayMax);
        System.out.println("max = " + a);
        System.out.println("max / 2 = " + a / 2);
        System.out.println("max * -1 = " + a * -1);
        System.out.println(a % 2 == 0 ? "even" : "odd");


    }
}
