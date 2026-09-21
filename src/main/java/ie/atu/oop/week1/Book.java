package ie.atu.oop.week1;

public class Book {
    public String title;
    public String author;
    public int pageCount;
    public boolean available = true;

    public void displayDetails() {
        System.out.println("Book: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book PageCount: " + pageCount);
        System.out.println("Is Book Available? " + available);
    }
}