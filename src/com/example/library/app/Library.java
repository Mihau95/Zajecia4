package com.example.library.app;

import com.example.library.model.Book;

public class Library {

    public static void main(String[] args) {
        Book book = new Book("Baranek", "Baran", 2345);
        book.showInfo();

    }
}
