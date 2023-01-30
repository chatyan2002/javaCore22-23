package homeworks.homework9;

public class DynamicArrayDemo4 {
    public static void main(String[] args) {
        DynamicArray4 da = new DynamicArray4();
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        da.deleteByIndex(4);
    }
}
