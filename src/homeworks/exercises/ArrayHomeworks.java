package homeworks.exercises;

public class ArrayHomeworks {
    public static void main(String[] args) {

        int [] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30 };

//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " | ");
//        }
//
//        System.out.println();


//        int max = array[1];
//        for (int i = 0; i < array.length; i++) {
//              if (array[i] > max){
//                max = array[i];
//            }
//
//        }
//            System.out.println("max=" + max);
//
//

        int min = array[1];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("min =" + min);
    }
}
