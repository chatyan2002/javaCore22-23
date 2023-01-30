package classwork;

import java.util.Scanner;

public class ScannnerDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nerberneq anuny");
        String name = scanner.nextLine();

        System.out.println("nerberneq heraxosahamry");
        String phoneNumber = scanner.nextLine();

        System.out.println("nerberneq coursi anuny");
        String coursName = scanner.nextLine();

        Student student = new Student(name,phoneNumber,coursName);
        System.out.println(student.coursName);
    }
}
