package chapter.chapter6;

public class Box {

    double width;
    double height;
    double depth;

    void volum() {
        System.out.print("volum = ");
        System.out.println(width * height * depth);
    }


   // @Override
//    public String toString() {
//        return "Box{" +
//                "width=" + width +
//                ", height=" + height +
//                ", depth=" + depth +
//                '}';
//    }

//    void volume() throws CloneNotSupportedException {
//       Object clone = clone();
//    }
//
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}
