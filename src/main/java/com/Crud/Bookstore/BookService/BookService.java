package com.Crud.Bookstore.BookService;

import com.Crud.Bookstore.Entity.Book;
import com.Crud.Bookstore.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository repo;

    public List<Book> getBook(){
        List<Book> bookList= new ArrayList<>();
        repo.findAll().forEach(book -> bookList.add(book));
        return bookList;
    }


    public Book createBook(Book book){
        return repo.save(book);
    }
    public Optional<Book> getBookById(Integer bookId){
        return repo.findById(bookId);
    }

    public Book updateBook(Book imcomingbook){
        return repo.save(imcomingbook);
    }

    public String deleteById(Integer bookId){
        repo.deleteById(bookId);
        return "Delete Successfully";
    }

}
