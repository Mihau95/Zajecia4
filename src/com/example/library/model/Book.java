package com.example.library.model;

public class Book {
    private String title;
    private String author;
    private int isbn;

   public Book(String t, String a, int nr) {
        this.title = t;
        this.author = a;
        this.isbn = nr;
    }

    public void showInfo(){
        System.out.println(this.title + " " + this.author + " " + this.isbn);
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
