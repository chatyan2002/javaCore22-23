package homeworks.homework7;

public class Calculator {
    double plus(double a, double b) {
        return a + b;
    }

    double minus(double a, double b) {

        return a - b;
    }

    double devide(double a, double b) {
        if(b == 0){
            System.out.println("tivy chi karox bajanvel 0-i");
            return -1;
        }
        return a / b;
    }

    double multiply(double a, double b) {
        return a * b;
    }
}
