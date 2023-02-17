package chapter.chapter8.book;

public class BookDemo {

    public static void main(String[] args) {
        Book book1 = new Book("girq1", 100, "Poxos");
        Book book2 = new Book("girq1", 100, "Poxos");
        Book book3 = book1;

        boolean equals = book1.equals(book3);
        System.out.println(equals);

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());


    }
}
