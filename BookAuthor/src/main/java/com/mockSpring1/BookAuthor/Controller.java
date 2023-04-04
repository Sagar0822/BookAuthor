package com.mockSpring1.BookAuthor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book_author")
public class Controller {

    @Autowired
    Service service;

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book){
        service.addBook(book);
        return "Book added";
    }

    @PostMapping("/addAuthor")
    public String addAuthor(@RequestBody Author author){
        service.addAuthor(author);
        return "Author added";
    }

   //1. Get Author who are under a given age Y and have rating greater than X.
    @GetMapping("/get-author")
    public List<Author> getAuthorByAge(@RequestParam("age") int age,@RequestParam("author") int rating) throws Exception{
        return service.getAuthorByAge(age,rating);
    }

   // 2. Given bookname B and no of pages X, Update the no of pages in that book
    @PutMapping("/update-pages")
    public String updateBook(String bookName, int pages) throws Exception {

             service.updateBook(bookName, pages);
             return "Book updated";
    }

    // 3. GET: Find out total no. the books who’s authors have rating greater than X.
    @GetMapping("/count-books")
    public int noOfBooks(int x){

        return service.noOfBooks(x);
    }

}
