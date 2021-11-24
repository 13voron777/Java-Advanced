package Lesson_10.HW10.Task3;

public class Run {
    public static void main(String[] args) {
        Book book = new Book("Pimsleur", "English", 500);
        Books books = (book1) -> System.out.println("Lambda " + book1);
        books.print(book);
    }
}
