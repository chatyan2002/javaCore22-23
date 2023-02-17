package chapter.chapter6.boxExamples.Box3;

public class BoxDemo3 {
    public static void main(String[] args) {

        Box3 myBox1 = new Box3(12,3,24);
        Box3 myBox2 = new Box3(43,6,90);
        double vol;

        vol = myBox1.volume();
        System.out.println("ardyuqny = " + vol);

        vol = myBox2.volume();
        System.out.println("ardyunqy 2rd-i = " + vol);
    }
}