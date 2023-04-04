package com.mockSpring1.BookAuthor;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service

public class Service {

    @Autowired
    Repository repository;
    public void addBook(Book book){
        repository.addBook(book);
    }

    public void addAuthor(Author author){
        repository.addAuthor(author);
    }
    public List<Author> getAuthorByAge(int age, int rating) throws Exception{
        return repository.getAuthorByAge(age,rating);
    }
    public void updateBook(String bookName, int pages) throws Exception{
      repository.updateBook(bookName, pages);
    }

    public int noOfBooks(int x){

        return repository.noOfBooks(x);
    }
}
