package homeworks.homework8;

public class DynamicArrayDemo1 {
    public static void main(String[] args) {
        DynamicArray1 dy = new DynamicArray1();

        for (int i = 0; i < 1000; i++) {
            dy.add(i + 1);
        }
        dy.print();
    }

}
