package chapter5;

public class WhileExample {
    public static void main(String[] args) {
        int n = 10;
        while (n > 0){
            System.out.println(n);
            n--;
       }


        int i, j;
        i = 100;
        j = 200;
        while (++i < --j) ;
        System.out.println(i);
    }
}
