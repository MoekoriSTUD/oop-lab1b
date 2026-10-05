package ie.atu.oop.week1;

public class Book {
    private final String title;
    private final String author;
    private final int pageCount;
    private BookStatus status;
    public boolean available = true;

    public Book(String title, String author, int pageCount) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be empty or null");
        }

        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Author cannot be empty or null");
        }

        if (pageCount < 1) {
            throw new IllegalArgumentException("Page count cannot be zero or negative");
        }

        this.title = title.trim();
        this.author = author.trim();
        this.pageCount = pageCount;
        this.status = BookStatus.AVAILABLE;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPageCount() {
        return pageCount;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void borrowBook() {
        if (status == BookStatus.ON_LOAN) {
            throw new IllegalStateException("Book is already on loan");
        }
        status = BookStatus.ON_LOAN;
    }

    public void returnBook() {
        if (status == BookStatus.AVAILABLE) {
            throw new IllegalStateException("Book is already available");
        }
        status = BookStatus.AVAILABLE;
    }

//    public void displayDetails() {
//        System.out.println("Book: " + title);
//        System.out.println("Book Author: " + author);
//        System.out.println("Book PageCount: " + pageCount);
//        System.out.println("Is Book Available? " + available);
//    }
//
//    public void borrowBook() {
//        if (available) {
//            available = false;
//            System.out.println(title + " borrowed successfully");
//        } else {
//            System.out.println(title + " not available");
//        }
//    }
}