package chapter.chapter8.book;

import java.util.Objects;

public class Book {

    String title;
    double price;
    String author;

    public Book(String title, double price, String author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj){
//            return true;
//        }
//        if(obj instanceof Book){
//            Book b = (Book) obj;
//            return title.equals(b.title)
//                    && price == (b.price)
//                    && author == (b.author);
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, author);
    }
}
