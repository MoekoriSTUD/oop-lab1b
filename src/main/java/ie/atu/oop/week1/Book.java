package ie.atu.oop.week1;

public class Book {
    public String title;
    public String author;
    public int pageCount;
    public boolean available = true;

    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
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