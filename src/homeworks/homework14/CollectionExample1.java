package homeworks.homework14;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExample1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("poxos");
        names.add("petros");
        names.add("martiros");
        names.add("akros");
        names.add("moso");


        searchName(names);

        deleteName(names);

        changeName(names);


    }

    private static void changeName(ArrayList<String> names) {
        String in = scanner.nextLine();
        String nam = scanner.nextLine();
        names.add(Integer.parseInt(in),nam);
        System.out.println(names);
    }

    private static void deleteName(ArrayList<String> names) {
        System.out.println("please input name");
        String Name = scanner.nextLine();
        System.out.println(names.remove(Name));
        System.out.println(names);
    }

    private static void searchName(ArrayList<String> names) {
        System.out.println("please input name");
        String name = scanner.nextLine();
        if (names.contains(name)) {
            System.out.println("this name already exists!");
        } else {
            System.out.println("there is no name!");
        }
    }


}
