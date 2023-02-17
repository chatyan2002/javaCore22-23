package chapter.chapter8.booksproekt;

import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStorage bookStorage = new BookStorage();
        boolean isRun = true;
        while (isRun){
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for add book");
            System.out.println("please input 2 for print all");
            System.out.println("please input 3 for search book by name");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("please input books title");
                    String title = scanner.nextLine();
                    System.out.println("please input books price");
                    String price = scanner.nextLine();
                    System.out.println("please input books author");
                    String author = scanner.nextLine();
                    Book book = new Book(title, Double.parseDouble(price), author);
                    bookStorage.add(book);
                    System.out.println("book is created");
                    break;
                case "2":
                    bookStorage.print();
                    break;
                case "3":
                    System.out.println("please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.searchByName(keyword);
                    break;
                default:
                    System.out.println("Wrong command. Please try again!");

            }
        }
    }
}
