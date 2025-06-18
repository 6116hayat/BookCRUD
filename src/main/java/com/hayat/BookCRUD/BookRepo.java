package com.hayat.BookCRUD;

import org.springframework.data.jpa.repository.JpaRepository;

/*
    JPA Repositories :  This helps in interacting with Database
    Provides the Built-in CRUD Operation without adding any SQL commands
 */

public interface BookRepo extends JpaRepository<Book, Long> { }
