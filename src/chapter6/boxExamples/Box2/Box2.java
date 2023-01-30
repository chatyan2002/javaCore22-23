package chapter6.boxExamples.Box2;

public class Box2 {
    int width;
    int height;
    int depth;

    int volume(){
        return width * height % depth;
    }
    void setDim (int w, int h, int d){
        width = w;
        height = h;
        depth = d;
    }
}
