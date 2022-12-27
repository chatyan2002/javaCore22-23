package chapter4;

public class IncrementExample {
    public static void main(String[] args) {


//        int a = 1 + 1;
//        int b = a * 3;
//        int c = b / 4;
//        int d = c - a;
//        int e = -d;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);
//        System.out.println("e = " + e);
//
//        System.out.println();
//
//
//        double da = 1 + 1;
//        double db = da * 3;
//        double dc = db / 4;
//        double dd = dc - a;
//        double de = -dd;
//        System.out.println("da = " + da);
//        System.out.println("db = " + db);
//        System.out.println("dc = " + dc);
//        System.out.println("dd = " + dd);
//        System.out.println("de = " + de);


        System.out.println();
        // modul %bajanumov

        int x = 42;
        double y = 42.25;

        System.out.println("x mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);


        System.out.println();

        int k = 1;
        int l= 2;
        int m = 3;
        k += 5;
        l *= 4;
        m += k * l;
        m %= 6;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);

        System.out.println();

        int a = 1;
        int b = 2;
        int c;
        int d;
        c = ++b;
        d = a++;
        c++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d + " + d);

        System.out.println();

        int n = 1;
        int o = 2;
        int p = 3;
        n |= 4;
        o >>= 1;
        p <<= 1;
        n ^= p;

        System.out.println("n = " + n);
        System.out.println("o = " + o);
        System.out.println("p = " + p);


    }
}
