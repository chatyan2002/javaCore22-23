package chapter.chapter12.enumeExample;

public class EnomDemo2 {

    public static void main(String[] args) {

        Apple ap;
        System.out.println("price for Winesap apples " + Apple.Winesap.getPrice() + " cent \n");
        System.out.println("prices for all apples");
        for (Apple a : Apple.values()) {
            System.out.println(a + " price " + a.getPrice() + " cent ");

        }
    }
}
