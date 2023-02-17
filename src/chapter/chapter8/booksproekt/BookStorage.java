package chapter.chapter8.booksproekt;

public class BookStorage {

    private Book[] array = new Book[10];
    private int size = 0;


    public void add(Book valu) {
        if (size == array.length) {
            extend();
        }
        array[size++] = valu;
    }

    public void extend() {
        Book[] result = new Book[array.length + 10];
        for (int i = 0; i < size; i++) {
            result[i] = array[i];
        }
        array = result;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
    }

    public void searchByName(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Book book = array[i];
            if(book.getTitle().contains(keyword)){
                System.out.println(book);
            }
        }
        if(!found){
            System.out.println("book with " + keyword + "does not exists");
        }
    }
}
