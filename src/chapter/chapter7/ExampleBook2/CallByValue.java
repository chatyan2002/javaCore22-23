package chapter.chapter7.ExampleBook2;

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;
        System.out.println("a and b minchev kanchy : " + a + " " + b);
        ob.meth(a,b);
        System.out.println("a and b kanchic heto : " + a + " " + b );
    }
}
