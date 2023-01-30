package repeatUnits;

public class Box {

    double width;
    double height;
    double depth;

    Box() {
        System.out.println("konstruktorayin obyekt Box");
        width = 10;
        height = 19;
        depth = 6;
        }
        double volume () {
        return width * height * depth;
        }

}
