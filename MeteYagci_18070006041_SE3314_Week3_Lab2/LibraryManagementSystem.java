package org.example;
import java.util.Scanner;


public class LibraryManagementSystem {
    private static Library library = new Library();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            Menu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    AvailableBooks();
                    break;
                case 3:
                    checkoutBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5");
            }
        } while (choice != 5);
        scanner.close();
    }

    private static void Menu() {
        System.out.println("Library Management System Menu:");
        System.out.println("1. Add a book");
        System.out.println("2. Display available books");
        System.out.println("3. Check out a book");
        System.out.println("4. Return a book");
        System.out.println("5. Exit");
    }

    private static void addBook() {
        System.out.print("Enter the title of the book: ");
        String title = scanner.nextLine();
        System.out.print("Enter the author of the book: ");
        String author = scanner.nextLine();
        System.out.print("Enter the ISBN of the book: ");
        String ISBN = scanner.nextLine();

        Book book = new Book(title, author, ISBN);
        library.addBook(book);
        System.out.println("Book added successfully.");
    }

    private static void AvailableBooks() {
        System.out.println("Available books in the library:");
        for (Book book : library.getBooks()) {
            if (book.isAvailable()) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN());
            }
        }
    }

    private static void checkoutBook() {
        System.out.print("Enter the ISBN of the book to check out: ");
        String ISBN = scanner.nextLine();

        Book bookToCheckout = findBookByISBN(ISBN);
        if (bookToCheckout != null) {
            library.checkout(bookToCheckout);
            System.out.println("Book checked out successfully.");
        } else {
            System.out.println("Book not found in the library.");
        }
    }

    private static void returnBook() {
        System.out.print("Enter the ISBN of the book to return: ");
        String ISBN = scanner.nextLine();

        Book bookToReturn = findBookByISBN(ISBN);
        if (bookToReturn != null) {
            library.returnBook(bookToReturn);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book not found in the library.");
        }
    }
//-------------------
    private static Book findBookByISBN(String ISBN) {
        for (Book book : library.getBooks()) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }
}
