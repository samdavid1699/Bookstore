package com.Crud.Bookstore.Entity;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String BookName;
    private String Author;
@Column(name = "description")
    private String Desc;
public Book(){

}


    public Book(int id, String bookName, String author, String desc) {
        super();
        this.id = id;
        BookName = bookName;
        Author = author;
        Desc = desc;
    }




    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBookName() {
        return BookName;
    }
    public void setBookName(String bookName) {
        BookName = bookName;
    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String author) {
        Author = author;
    }
    public String getDesc() {
        return Desc;
    }
    public void setDesc(String desc) {
        Desc = desc;
    }


}
