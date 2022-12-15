package chapter3;

public class Homework2 {
    public static void main(String[] args) {
//        int lightspeed;
//        long days;
//        long seconds;
//        long distance;
//
//        lightspeed = 186000;
//        days = 1000;
//        seconds = days * 24 * 60 * 60;
//        distance = lightspeed * seconds;
//        System.out.println("for " + days);
//        System.out.println("after days");
//        System.out.println(distance + "mile");

        for(int i = 0; i < 6; i++){
           for (int j = 6; j > i; j--){
                System.out.print(" ");
            }
           for (int j = 0; j <= i; j++){
               System.out.print("* ");
           }
            System.out.println();
        }
        for (int i = 0; i < 5; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for (int j = 5; j > i; j--){
            System.out.print(" *");
        }
            System.out.println();
        }




        for (int i = 0; i < 6; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(" *");
            }
            for (int j = 0; j > i;j--){
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("");
            }
            for (int j = 5; j > i; j--){
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(" *");
            }
//            for (int j = 0; j > i; j++){
//                System.out.println(" ");
//            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++){
            for (int j = 0; j <= i; j++ ){
                System.out.print(" ");
            }
            for (int j = 5; j > i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
