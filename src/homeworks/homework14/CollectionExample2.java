package homeworks.homework14;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExample2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("we are two methods");
       noRepetition();

        sortNames();
    }

    public static void noRepetition() {
        boolean a = false;
        Set<String> names = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("please input 5 names");
            String name = scanner.nextLine();
            names.add(name);
        }
        System.out.println(names);
    }

    public static void sortNames() {
        Set<String> names = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("please input 10 names");
            String name = scanner.nextLine();
            names.add(name);
        }
        System.out.println(names);
    }
}