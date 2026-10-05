package ie.atu.oop.week1;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private static final int MAX_LOAN_DAYS = 14;

    private final List <Book> books = new ArrayList<>();

    public void loanBook(Book book, int loanDays) {
        if (book == null) {
            throw new IllegalArgumentException("Book must not be null");
        }
        if (loanDays < 0 || loanDays > MAX_LOAN_DAYS) {
            throw new IllegalArgumentException("Loan days must be from 1 to 14");
        }
        book.borrowBook();
    }

    public void returnBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book must not be null");
        }
        book.returnBook();
    }

    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book must not be null");
        }

        books.add(book);
    }

    public boolean removeBook(String bookName) {
        Book book1 = findBookByTitle(bookName);
        if (book1 == null) {
            return false;
        }
        books.remove(book1);
        return true;
    }

    public int getBookCount() {
        return books.size();
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}
