package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    /**
     * books arraylist
     */
    public List<Book> books = new ArrayList<>();


    /**
     * @param b adds new book to the library
     * @throws IllegalArgumentException If the book is null
     */
    public void addBook(Book b) {
        if (b == null) {
            throw new IllegalArgumentException("Book cannot be null.");
        }
        books.add(b);
    }

    /**
     *
     * @param word checks book's title or  author's name includes
     * @return results
     */
    public List<Book> search(String word){
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(word) ||
                    book.getAuthor().contains(word)) {
                results.add(book);
            }
        }
        return results;
        }




    /**
     * @param b checkout the book
     * @throws  IllegalArgumentException if book is null or if its not available
     */
    public void checkout(Book b) {
        if (b == null) {
            throw new IllegalArgumentException("Book cannot be null.");
        }
        if (!b.isAvailable()) {
            throw new IllegalStateException("Book is not available");
        }
        b.setAvailable(false);
    }


    /**
     * @param b The book to return.
     * @throws IllegalArgumentException If the book is null or already available otherwise exception
     */
    public void returnBook(Book b) {
        if (b == null) {
            throw new IllegalArgumentException("Book cannot be null.");
        }
        if (b.isAvailable()) {
            throw new IllegalStateException("Book is  available.");
        }
        b.setAvailable(true);
    }

    /**
     *
     * @param
     */
    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }
}
