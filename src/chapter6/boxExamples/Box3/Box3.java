package chapter6.boxExamples.Box3;

public class Box3 {
    double width;
    double height;
    double depth;

    Box3(double w, double h, double d) {
        System.out.println("konstruktorayin arjeqy ");
        width = w;
        height = h;
        depth = d;
    }
    double volume(){
        return width * height * depth;
    }

}
