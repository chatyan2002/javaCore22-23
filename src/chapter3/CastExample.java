package chapter3;

public class CastExample {
    public static void main(String[] args) {

//       byte b;
//       int i = 257;
//       double d = 323.142;
//        System.out.println("\npoxanakum int-ic byte");
//        b = (byte) i;
//        System.out.println("i and b" + i + "" + b);
//
//        System.out.println("poxanakum double - int");
//
//        i = (int) d;
//        System.out.println("d and i" + d + "" + i);
//
//        System.out.println("poxanakum double - byte");
//
//        b = (byte) d;
//        System.out.println("d and b" + d + " " + b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//
//        byte b = 50;
//        b = b * 2;

        byte b = 50;
        b = (byte) (b * 2);


        byte Ь = 42;
        char с = 'а';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * Ь) + (i / с) - (d * s);
        System.out.println((f * Ь) + "+" + (i / с)
                + " - " + (d * s));
        System.out.println("result = " + result);
    }
}
