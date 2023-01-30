package homeworks.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.plus(5, 8));
        System.out.println(calculator.minus(50,26));
        System.out.println(calculator.devide(44,0));
        System.out.println(calculator.multiply(56,98));

    }
}
