package chapter7;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox1 = new Box(12, 13, 6);
        Box myBox2 = new Box();
        Box mycube = new Box(7);
        double vol;

        vol = myBox1.volume();
        System.out.println("cavaly = " + vol);

        vol = myBox2.volume();
        System.out.println("cavaly myBox2 - i = " + vol);

        vol = mycube.volume();
        System.out.println("cavaly myCub - i = " + vol);
    }
}
