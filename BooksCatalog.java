// Create a class called "BooksCatalog" that has a list of objects of type "Book" as an attribute. 
// Each book has attributes such as title, author and year of publication. Implement the following methods:
// addBook(String title, String author, intPublication year): Adds a book to the catalog.
// searchByAuthor(String author): Searches for books by author and returns a list of the books found.
// searchByYearInterval(intstartyear, intendyear): Searches for books published in a given range of years and returns a list of the books found.
// searchByTitle(String title): Searches for books by title and returns the first book found.

import java.util.ArrayList;
import java.util.List;

import list.Search.Book;

public class BooksCatalog {

    private List<Book> bookList;

    public BooksCatalog() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(String title, String author, int year) {
        bookList.add(new Book(title, author, year));
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        if (!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getAuthor().equalsIgnoreCase(author)) {
                    booksByAuthor.add(b);
                }
            }
        }
        return booksByAuthor;
    }

    public List<Book> searchByYearInterval(int startYear, int endYear) {
        List<Book> booksByYearInterval = new ArrayList<>();
        if (!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getYear() >= startYear && b.getYear() <= endYear) {
                    booksByYearInterval.add(b);
                }
            }
        }
        return booksByYearInterval;
    }

    public Book searchByTitle(String title) {
        Book booksByTitle = null;
        if (!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getTitle().equalsIgnoreCase(title)) {
                    booksByTitle = b;
                    break;
                }
            }
        }
        return booksByTitle;
    }

    // Unitary Tests
    public static void main(String[] args) {
        BooksCatalog booksCatalog = new BooksCatalog();

        booksCatalog.addBook("Book 1", "Author 1", 2020);
        booksCatalog.addBook("Book 1", "Author 2", 2021);
        booksCatalog.addBook("Book 2", "Author 2", 2023);
        booksCatalog.addBook("Book 3", "Author 3", 1992);

        System.out.println(booksCatalog.searchByAuthor("Author 3"));

        System.out.println(booksCatalog.searchByAuthor("Author 2"));

        System.out.println(booksCatalog.searchByYearInterval(2010, 2022));

        System.out.println(booksCatalog.searchByYearInterval(1990, 2020));

        System.out.println(booksCatalog.searchByTitle("Book 1"));

        System.out.println(booksCatalog.searchByTitle("Book 3"));
    }
}
