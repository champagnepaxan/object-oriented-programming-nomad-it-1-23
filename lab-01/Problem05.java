// задача 5 библиотека
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class Problem05 {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("Анна Каренина", "Лев Толстой"));
        library.add(new Book("Мастер и Маргарита", "Михаил Булгаков"));
        library.add(new Book("Собачье сердце", "Михаил Булгаков"));
        library.add(new Book("Отверженные", "Виктор Гюго"));


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя автора: ");
        String searchAuthor = scanner.nextLine();

        System.out.println("Книги автора " + searchAuthor + ":");
        boolean found = false;
        for (Book book : library) {
            if (book.author.equalsIgnoreCase(searchAuthor)) {
                System.out.println("- " + book.title);
                found = true;
            }
        }

        if (!found) System.out.println("Книг данного автора не найдено.");
    }
}