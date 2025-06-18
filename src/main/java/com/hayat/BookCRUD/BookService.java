package com.hayat.BookCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BookService {

    private final BookRepo bookRepo;

    @Autowired
    // Constructor parameter for initializing bookRepo
    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    // Create (POST)
    public Book save(Book book) {
        return bookRepo.save(book);
    }

    // Retrieve All books (GET)
    public List<Book> findAll(){
        return bookRepo.findAll();
    }


    //Retrieve Books by ID (Get by ID)
    public Optional<Book> findById(Long id){
        return bookRepo.findById(id);
    }

    //Update Books by ID (PUT by ID)
    public Optional<Book> updateBook(Long id, Book newBook){
        return bookRepo.findById(id).map(book -> {
            book.setTitle(newBook.getTitle());
            book.setAuthor(newBook.getAuthor());
            book.setIsbn(newBook.getIsbn());
            book.setPrice(newBook.getPrice());
            return bookRepo.save(book);
        });
    }

    //Delete by ID
    public void deleteById(long id){
        bookRepo.deleteById(id);
    }
}
