package com.example.vialibrary;

public class Books {
    private String title, author;
    private int ISBN;
   private Date publicationOfYear;

    public Books(String title, String author, int ISBN, Date publicationOfYear) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationOfYear = publicationOfYear;
    }

    public String getTitle() {
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

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public Date getPublicationOfYear() {
        return publicationOfYear;
    }

    public void setPublicationOfYear(Date publicationOfYear) {
        this.publicationOfYear = publicationOfYear;
    }
}
