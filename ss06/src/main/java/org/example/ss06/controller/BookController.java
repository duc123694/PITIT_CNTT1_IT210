package org.example.ss06.controller;

import org.example.ss06.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    List<Book> books = new ArrayList<>();
    public BookController(){
        books.add(new Book(1,"Java Basic","Nam",200000));
        books.add(new Book(2,"Java Basic","Nam",200000));
        books.add(new Book(3,"Java Basic","Nam",200000));
        books.add(new Book(4,"Java Basic","Nam",200000));
    }
    @GetMapping("/books")
    public String listBooks(Model model){
        model.addAttribute("books",books);
        return "books";
    }
    @GetMapping("/books/id")
    public String bookDetail(@PathVariable int id,Model model){
        for(Book b: books){
            if(b.getId() == id){
                model.addAttribute("book",b);
                break;
            }
        }
        return "detail";
    }
}
