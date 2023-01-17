package homeworks.homeworks7;

public class Calculator {
    double one;
    double two;
    double plusing (){
        return one + two;
    }
    double minusing () {
        return one - two;
    }
    double deviding (){
        return one / two;
    }


    void resault(double a, double b) {
        one = a;
        two = b;
    }

    double multiplying(){
        return one * two;

    }
    int resault1 (double a, double b){
        if(b == 0){
            System.out.println("tivy 0-i chi bajanvum");
        }
        return -1;
    }
}
