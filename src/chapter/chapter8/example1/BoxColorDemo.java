package chapter.chapter8.example1;

public class BoxColorDemo {
    public static void main(String[] args) {
        BoxColor myBox1 = new BoxColor(10,20,22,0.3);
        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);
        System.out.println(myBox1.color);

        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
        Box plainbox = new Box();
        double vol1;
        vol1 = weightbox.volume();
        System.out.println("volume of weihtbox is " + vol1);
        System.out.println("weight of weightbox is " + weightbox.weight);
        System.out.println();

        plainbox = weightbox;

        vol1 = plainbox.volume();
        System.out.println("volume of plainbox is " + vol1);
    }
}
