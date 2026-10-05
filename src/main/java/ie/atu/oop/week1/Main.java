package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book first = new Book("Dune", "Frank Herbert", 412);
        Book second = new Book("Clean Code", "Robert C. Martin", 464);
        LibraryService service = new LibraryService();
        System.out.println(first.getStatus());
        service.loanBook(first, 7);
        System.out.println(first.getStatus());
        service.returnBook(first);
        System.out.println(first.getStatus());
        System.out.println(second.getStatus());
        try {
            service.loanBook(first, 15);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(first.getStatus());
//        try {
//            Book myBook = new Book("Dune", "Frank", 412);
//            System.out.println(myBook.getTitle());
//            System.out.println(myBook.getAuthor());
//            System.out.println(myBook.getPageCount());
//        } catch (IllegalArgumentException ex) {
//            System.out.println("Error: " + ex.getMessage());
//        }
    }
}