package com.mockSpring1.BookAuthor;

public class Book {

    private String bookname;

    private int pages;

    private Author authorName;

    public Book(){

    }

    public Book(String bookname, int pages, Author authorName) {
        this.bookname = bookname;
        this.pages = pages;
        this.authorName = authorName;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public void setAuthorName(Author authorName) {
        this.authorName = authorName;
    }
}
