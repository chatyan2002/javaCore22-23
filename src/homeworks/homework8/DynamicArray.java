package homeworks.homework8;

public class DynamicArray {

    private int[] array = new int[10];

    private int size = 0;


    DynamicArray() {
        size = 0;
    }

    public void add(int valu) {
        if (size == array.length) {
            extend();
        }
        array[size++] = valu;
    }

    public void extend() {
        int[] result = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            result[i] = array[i];
        }
        array = result;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
    }
}
