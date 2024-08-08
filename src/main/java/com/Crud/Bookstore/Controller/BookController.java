package com.Crud.Bookstore.Controller;

import com.Crud.Bookstore.BookService.BookService;
import com.Crud.Bookstore.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
@Autowired
    private BookService service;

    @RequestMapping(value="/books")
    public List<Book> getBook(){
        return service.getBook();
    }

    @PostMapping(value = "/book")
    public Book createBook(@RequestBody Book book){
        return service.createBook(book);
    }

    @GetMapping(value = "/books/{id}")
    public Optional<Book> getBookById(@PathVariable("id") Integer bookId){
        return service.getBookById(bookId);
    }
    @PutMapping(value = "/books")
    public Book updateBook(@RequestBody Book imcomingbook){
        return service.updateBook(imcomingbook);
    }
    @DeleteMapping(value = "/books/{bookId}")
    public String deleteById(@PathVariable Integer bookId){
        return service.deleteById(bookId);
    }

}
