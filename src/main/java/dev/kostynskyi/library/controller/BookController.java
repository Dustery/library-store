package dev.kostynskyi.library.controller;

import dev.kostynskyi.library.domain.Book;
import dev.kostynskyi.library.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("/books")
    public String findAllBooks(Model model) {
        model.addAttribute(service.findAllBooks());
        return "books";
    }

    @GetMapping("/add")
    public String addBook(Model model) {
        model.addAttribute("book", new Book());
        return "/add";
    }

    @PostMapping("/books")
    public String create(@ModelAttribute("book") Book book) {
        service.addBook(book);
        return "redirect:/books";
    }
}