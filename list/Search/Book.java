// Create a class called "BooksCatalog" that has a list of objects of type "Book" as an attribute. 
// Each book has attributes such as title, author and year of publication. Implement the following methods:
// addBook(String title, String author, intPublication year): Adds a book to the catalog.
// searchByAuthor(String author): Searches for books by author and returns a list of the books found.
// searchByYearInterval(intstartyear, intendyear): Searches for books published in a given range of years and returns a list of the books found.
// searchByTitle(String title): Searches for books by title and returns the first book found.

package list.Search;

public class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
    }

}
