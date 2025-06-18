package com.hayat.BookCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Defines REST API for usages
@RequestMapping("/books") // sets API base path
public class BookController {
    private final BookService bookService;
    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    /*
    Autowired :  Spring annotation used for automatic dependency injection. It allows Spring to automatically provide the required beans(components) to a class without needing manual instantiation
     */

    // posting sample data to database
    @PostMapping
    public Book addBook(@RequestBody Book book){
        return bookService.save(book);
    }

    // Fetching data from DataBase
    @GetMapping
    public List<Book> getBooks(){
        return bookService.findAll();
    }

    //Fetch Book by ID
    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id){
        return bookService.findById(id).orElse(null);
    }

    // Update book using Id
    @PutMapping("{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book newBook){
        return bookService.findById(id).map(book -> {
            book.setTitle(newBook.getTitle());
            book.setAuthor(newBook.getAuthor());
            book.setIsbn(newBook.getIsbn());
            book.setPrice(newBook.getPrice());
            return bookService.save(book);
        }).orElse(null);
    }

    //Delete book by ID
    @DeleteMapping("{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.deleteById(id);
    }

}
