package chapter.chapter6;

public class BoxDemo {
    public static void main(String[] args) {

        Box myBox = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        vol = myBox.depth * myBox.height * myBox.width;
        System.out.println("volum = " + vol);

        vol = myBox2.depth * myBox2.width * myBox2.height;
        System.out.println("volum = " + vol );
    }
}
