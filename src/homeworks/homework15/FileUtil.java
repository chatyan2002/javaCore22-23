package homeworks.homework15;

import java.io.File;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        fileSearch();
    }

    static void fileSearch() {
        File file = new File("C:\\Users\\User\\IdeaProjects\\homework\\src\\homeworks\\homework15");
        System.out.println("Please input pathName");
        String pathName = scanner.nextLine();
        System.out.println("Please input fileName");
        String fileName = scanner.nextLine();
        if (pathName.equals(file)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
