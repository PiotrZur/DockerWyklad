package com.capgemini.dockerexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    BookRepository bookRepository;

    public MainController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("bookList", bookRepository.findAll());
        model.addAttribute("newBook", new Book());
        return "books";
    }

    @PostMapping("/addBook")
    public String addBook(@ModelAttribute("newBook") Book newBook, Model model) {
        bookRepository.save(newBook);
        return "redirect:/" ;
    }


}
