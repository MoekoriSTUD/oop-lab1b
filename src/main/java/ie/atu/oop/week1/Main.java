package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Adios amigos~~~");

        Book firstBook = new Book();

        firstBook.title = "Dune";
        firstBook.author = "Frank";
        firstBook.pageCount = 412;

        System.out.println("First Book: " + firstBook.title);
        System.out.println("First Book Author: " + firstBook.author);
        System.out.println("First Book PageCount: " + firstBook.pageCount);
        System.out.println("First Book Available? " + firstBook.available);
        System.out.println("\n");
        firstBook.borrowBook();
        firstBook.displayDetails();
        System.out.println("\n");

        Book secondBook = new Book();

        secondBook.title = "Star Trek";
        secondBook.author = "Dave";
        secondBook.pageCount = 300;

        System.out.print("Second Book: \n");
        secondBook.displayDetails();
    }
}