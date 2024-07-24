package Task3;

import java.util.Scanner;

public class BookManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library lib = new Library();

        while (true) {
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Display Books");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Is Available (true/false): ");
                    boolean isAvailable = scanner.nextBoolean();
                    Book newBook = new Book(bookID, title, author, isAvailable);
                    lib.addBook(newBook);
                    break;

                case 2:
                    System.out.print("Enter Book ID to search: ");
                    int searchBookID = scanner.nextInt();
                    Book searchedBook = lib.searchBook(searchBookID);
                    if (searchedBook != null) {
                        searchedBook.displayBookDetails();
                    } else {
                        System.out.println("Book with ID " + searchBookID + " not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to remove: ");
                    int removeBookID = scanner.nextInt();
                    lib.removeBook(removeBookID);
                    break;

                case 4:
                    lib.displayBooks();
                    break;

            }
        }


    }
}
