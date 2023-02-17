package chapter.chapter8.example1;

public class BoxWeightDemo {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10,20,15,34.3);
        BoxWeight myBox2 = new BoxWeight(2,3,4,0.076);
        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);
        System.out.println("Weight of myBox1 is " + myBox1.weight);

        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);
        System.out.println("Weight of myBox2 is " + myBox2.weight);
    }
}
