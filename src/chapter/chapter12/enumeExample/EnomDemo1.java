package chapter.chapter12.enumeExample;

public class EnomDemo1 {
    public static void main(String[] args) {

        Apple ap;
        System.out.println("all enums for Apple types");

        Apple[] allApples = Apple.values();
        for (Apple a : allApples) {
            System.out.println(a);
        }
        System.out.println();
        ap = Apple.valueOf("Winesap");
        System.out.println("ap is " + ap);
    }
}
