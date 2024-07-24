package Task3;

import java.util.Scanner;

public class Library {

    private Book[] books;
    private int bookCount;

    public Library() {
        this.books = new Book[5];
        bookCount = 0;
    }

    public void addBook(Book book){
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount ++;
            System.out.println("Book added successfully.");
        }
    }

    public Book searchBook(int bookID) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookId() == bookID) {
                return books[i];
            }
        }
        return null;
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookId() == bookID) {
                books[i] = books[bookCount - 1]; // Replace with the last book
                books[bookCount - 1] = null;     // Nullify the last book
                bookCount--;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    public void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
        } else {
            for (int i = 0; i < bookCount; i++) {
                books[i].displayBookDetails();
                System.out.println("-------------------------");
            }
        }
    }

}
