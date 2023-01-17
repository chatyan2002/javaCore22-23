package homeworks.exercises;

public class Array {

    int maxOfArray (int[] array) {
        int max = array[0];
        for (int i : array) {
            if(i > max){
                max = i;
            }
        }
        return max;
    }

}