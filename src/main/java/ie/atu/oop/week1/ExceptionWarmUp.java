package ie.atu.oop.week1;

import java.util.Scanner;

public class ExceptionWarmUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a page count: ");
            String text = scan.nextLine();
            int pagecount = 0;
            try {
                pagecount = Integer.parseInt(text);
                System.out.println("You entered: " + pagecount);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input " + e.getMessage());
            }
        }
    }
}
