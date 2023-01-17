package repeatUnits;

public class AllUnits {
    public static void main(String[] args) {

        int x = 20;
        int y = 22;
//
//        if (x > y){
//            System.out.println("x = " + x);
//        }else {
//            System.out.println("y = " + y);
//        }

//        System.out.println();
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print(i + " ");
//        }
//
//        int x, y;
//        y = 20;
//        for ( x = 0; x < 10; x++) {
//            System.out.println("x = " + x);
//            System.out.println("y = " + y);
//            y = y - 3;
//        }

//        x = x * 3;
//        if (x > y) {
//            System.out.println("big is = " + x);
//        }
//
//        for (x = 20; x < 33; x = x + 3) {
//            System.out.print(x + " ");
//        }
//
//        for (int i = 0; i < 10; i++) {
//            int k = -1;
//            System.out.println("k = " + k);
//            k = 100;
//            System.out.println("k = " + k);
//        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("& ");
            }
            System.out.println();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print("% ");
            }
            System.out.println();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print("  ");
            }
            for (int p = 0; p < i; p++) {
                System.out.print("# ");
            }
            System.out.println();
        }


        for (int i = 0; i < 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print(" ");
            }
            for (int p = 0; p < i; p++) {
                System.out.print(" &");
            }
            System.out.println();
        }

        int[] array = {11, 22, 44, 21, 9, 0, 1, 2, 54, 99};
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
