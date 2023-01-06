package chapter5;

public class DoWhile {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;
        do {
            System.out.println("harcer operatorin:");
            System.out.println("    1.  if");
            System.out.println("    2.  switch");
            System.out.println("    3.  while");
            System.out.println("    4.  do-while");
            System.out.println("    5.  for\n");
            System.out.println("sxmeq anhrajesht kochaky");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("if:\n");
                System.out.println("if operator");
                System.out.println("else operator");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switch {");
                System.out.println("case");
                System.out.println("hajordakanutyuny operatorneri");
                System.out.println(" break");
                System.out.println(" // ...");
                System.out.println("}");
            case '3':
                System.out.println("while:\n");
                System.out.println("while operator");
                break;
            case '4':
                System.out.println("do-while:\n");
                System.out.println("do {");
                System.out.println("   operator");
                System.out.println("} while;");
                break;
            case '5':
                System.out.println("for:\n");
                System.out.println("for (payman)");
                System.out.println(" operator");
                break;
        }
    }
}
