package homeworks.homework5;

public class ArraySortDemo {
    public static void main(String[] args) {
        ArraySort as = new ArraySort();
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        as.sort(numbers);
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
