package homeworks.homework5;

public class ArraySort {

    void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[j - 1]) {
                   int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 1; j < array.length - i; j++) {
//                if (array[j] < array[j - 1]) {
//                    int tmp = array[j];
//                    array[j] = array[j - 1];
//                    array[j - 1] = tmp;
//                }
//            }
//        }
    }
}