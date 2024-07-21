import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> booksInfo = new ArrayList <>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages: ");
            Integer pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year: ");
            Integer publicationYear = Integer.valueOf(scanner.nextLine());
            
            booksInfo.add(new Book(title, pages, publicationYear));
        }
        System.out.println("What information will be printed? ");
        String printed = scanner.nextLine();
        
        for (Book bookInfo : booksInfo) {
            if (printed.equals("everything")) {
                System.out.println(bookInfo);
            }
            if (printed.equals("name")) {
                System.out.println(bookInfo.getTitle());
            }
        }
        

    }
}
