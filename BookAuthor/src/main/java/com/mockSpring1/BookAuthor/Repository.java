package com.mockSpring1.BookAuthor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Repository
public class Repository {

    Map<String, Book> bookMap = new HashMap<>();
    Map<String, Author> authorMap = new HashMap<>();

    public void addBook(Book book){
        bookMap.put(book.getBookname(), book);
    }

    public void addAuthor(Author author){
        authorMap.put(author.getName(), author);
    }

    //1. Get Author who are under a given age Y and have rating greater than X.
    public List<Author> getAuthorByAge(int age,int rating) throws Exception{
        List<Author> findAuthor = new ArrayList<>();
        for(Author author : authorMap.values()){
            if(author.getAge() < age){
                if(author.getRating() > rating){
                    findAuthor.add(author);
                }
            }
            if(findAuthor == null){
                throw new Exception("Author not found");
            }
        }
        return findAuthor;
    }

    public void updateBook(String bookName, int pages) throws Exception {
        Book book = null;
//        for(Book book1 : bookMap.values()){
//            if(book1.getBookname() == bookName){
//                book = bookMap.get(book1);
//            }
//        }
//        if(book == null){
//           throw new Exception("Book not available");
//        }
//        book.setPages(book.getPages() + pages);
//        return "Success";
        if(bookMap.containsKey(bookName)){
            book = bookMap.get(bookName);
            book.setPages(book.getPages()+pages);
        }
        bookMap.put(bookName, book);
    }
   //3. GET: Find out total no. the books who’s authors have rating greater than X.
    public int noOfBooks(int x){
        Author author;
        int bookCount = 0;
        for(Book book1 : bookMap.values()){
           author = book1.getAuthorName();
           float rating = author.getRating();

           if(rating > x){
               bookCount ++;
           }
        }
      return bookCount;
    }
}
