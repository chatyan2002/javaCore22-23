package chapter7.ExampleBook2;

public class PassObjRe {
    public static void main(String[] args) {
        Test1 ob = new Test1 (15, 20);
        System.out.println("ob.a and ob.b minchev kanchy : " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b kanchic heto: " + ob.a + " " + ob.b);

    }
}
