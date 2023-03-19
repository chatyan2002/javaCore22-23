package chapter.chapter12.enumeExample;

public class EnomDemo3 {

    public static void main(String[] args) {

        Apple ap, ap2, ap3;
        System.out.println("all type apples");

        for (Apple a : Apple.values()) {
            System.out.println(a + " " + a.ordinal());
        }
        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        System.out.println();

        if(ap.compareTo(ap2) < 0){
            System.out.println(ap + " predshestvuyet " + ap2);
        }

        if(ap.compareTo(ap2) > 0){
            System.out.println(ap2 + " predshestvuyet " + ap);
        }
        if(ap.compareTo(ap3) == 0){
            System.out.println(ap + " = " + ap3);
        }
        System.out.println();

        if(ap.equals(ap2)){
            System.out.println("error");
        }
        if(ap.equals(ap3)){
            System.out.println(ap + " = " + ap3);
        }
        if(ap == ap3){
            System.out.println(ap + " == " + ap3);
        }
    }
}

