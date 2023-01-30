package homeworks.homework9;

public class DynamicArray4 {

    private int[] array = new int[10];

    private int size = 0;

    public void deleteByIndex(int index) {

        if (index < 0 || index > size - 1) {
            System.out.println("wrong index");
            return;
        }

        for (int i = index; i < size; i--) {
            array[i] = array[i - 1];
            return;

        }
    }
}
