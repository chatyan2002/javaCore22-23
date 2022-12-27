package homeworks.homework2;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("this numbers are even");
        int a[] = {30, 2, 5, 67, 90, 21, 45, 66, 7, 9, 18};
        int f = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                f++;
                    }
        }
        System.out.println("together - " + f);
        System.out.println();

        System.out.println("this numbers are odd");
        int b[] = {30, 2, 5, 67, 90, 21, 45, 66, 7, 9, 18};
        int w = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 1) {
                System.out.print(b[i] + " ");
                w++;
            }
        }
        System.out.println("together - " + w);


        System.out.println();

        System.out.println("bolor tveri mijin tvabanakany");

        int c[] = {30, 2, 5, 67, 90, 21, 45, 66, 7, 9, 18};
        int result = 0;
        for (int i = 0; i < c.length; i++) {
            result = result + c[i];
        }
        System.out.print("mijin tvabanakany - " + result / c.length);

        System.out.println();
        System.out.println("bolor tveri gumary");

        int d[] = {30, 2, 5, 67, 90, 21, 45, 66, 7, 9, 18};
        int q = 0;
        for (int i = 0; i < d.length; i++) {
            q = q + c[i];
        }
        System.out.println("patasxan = " + q);
        System.out.println();

        System.out.println("first element");
        int e[] = {30, 2, 5, 67, 90, 21, 45, 66, 7, 9, 18};
        System.out.println("first element = " + e[0]);

        System.out.println();

        System.out.println("last element");
        int g[] = {30, 2, 5, 67, 90, 21, 45, 66, 7, 9, 18};
        System.out.println("last element = " + g[g.length-1] );

        System.out.println();
        System.out.println("in the middle element");
        int h[] = {30, 2, 5, 67, 90, 21, 45, 66, 7, 9, 18};
        System.out.println(h[h.length / 2]);
    }
}
