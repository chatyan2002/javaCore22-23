package homeworks.homeworks7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator cp = new Calculator();
        Calculator cm = new Calculator();
        Calculator cd = new Calculator();
        Calculator cml = new Calculator();
        double result;
        cp.resault(8, 66);
        cm.resault(71, 9);
        cd.resault(91, 9);
        result = cp.plusing();
        System.out.println(result);

        result = cm.minusing();
        System.out.println(result);

        result = cd.deviding();
        System.out.println(result);

        cml.resault1(42, 0);
        result = cml.multiplying();
        System.out.println(result);

    }
}
