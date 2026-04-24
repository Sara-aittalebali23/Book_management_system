package com.book_management.Service;

import com.book_management.DTO.BookDTO;
import com.book_management.Entity.Book;
import com.book_management.Entity.Genre;
import com.book_management.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book createBook(BookDTO bookDTO)
    {
        Book book = bookDTO.toEntity();

        return bookRepository.save(book);
    }

    public List<Book> deleteBook(Integer id)
    {
        bookRepository.deleteById(id);
        return bookRepository.findAll();
    }

    public Book updateBook(Integer id , BookDTO bookDTO)
    {
        Book book = bookRepository.findById(id).get();

        if(bookDTO.getTitle() != null)
        {
            book.setTitle(bookDTO.getTitle());
        }
        if (bookDTO.getAuthor() != null)
        {
            book.setAuthor(bookDTO.getAuthor());
        }
        if (bookDTO.getDescription() != null)
        {
            book.setDescription(bookDTO.getDescription());
        }
        if (bookDTO.getCover() != null)
        {
            book.setCover(bookDTO.getCover());
        }
        if (bookDTO.getGenre() != null)
        {
            book.setGenre(Genre.valueOf(bookDTO.getGenre()));
        }
        if (bookDTO.getLanguage() != null)
        {
            book.setLanguage(bookDTO.getLanguage());
        }
        if (bookDTO.getDateOfPublication() != null)
        {
            book.setDateOfPublication(bookDTO.getDateOfPublication());
        }
        if (bookDTO.getPublisher() != null)
        {
            book.setPublisher(bookDTO.getPublisher());
        }
        if (bookDTO.getLink() != null)
        {
            book.setLink(bookDTO.getLink());
        }

        return bookRepository.save(book) ;
    }
}
