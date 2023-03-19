package chapter.chapter14.GenExample.GnE5;

public class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] o){
        coords = o;
    }
}
