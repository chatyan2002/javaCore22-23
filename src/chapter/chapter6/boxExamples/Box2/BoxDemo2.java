package chapter.chapter6.boxExamples.Box2;

public class BoxDemo2 {

    public static void main(String[] args) {
        Box2 myBox1 = new Box2();
        Box2 myBox2 = new Box2();
        double vol;

        myBox1.setDim(111, 222, 333);
        myBox2.setDim(777, 888, 999);

        vol = myBox1.volume();
        System.out.println("ardyunq : " + vol);

        vol = myBox2.volume();
        System.out.println("2rd ardyunq : " + vol);
    }
}
