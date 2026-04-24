package com.book_management.Controller;

import com.book_management.DTO.BookDTO;
import com.book_management.Entity.Book;
import com.book_management.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/api/book")
    public List<Book> GetBook()
    {
        return bookService.getAllBooks();
    }

    @PostMapping("/api/book")
    public ResponseEntity<String> createBook(@RequestBody BookDTO bookDTO)
    {
        bookService.createBook(bookDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body( "Book created successfully");
    }

    @DeleteMapping("/api/book/{id}")
    public ResponseEntity<String> DeleteBook(@PathVariable Integer id)
    {
        bookService.deleteBook(id);
        return ResponseEntity.status(HttpStatus.OK).body("Book with id ="+" "+id+" "+"deleted successfully");
    }
    @PutMapping("/api/book/{id}")
    public ResponseEntity<String> UpdateBook(@PathVariable Integer id , @RequestBody BookDTO bookDTO)
    {
        bookService.updateBook(id,bookDTO);
        return ResponseEntity.status(HttpStatus.OK).body("Book with id ="+" "+id+" "+"updated successfully");
    }
}
