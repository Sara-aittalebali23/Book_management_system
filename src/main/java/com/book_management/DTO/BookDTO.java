package com.book_management.DTO;

import com.book_management.Entity.Book;
import com.book_management.Entity.Genre;

import java.time.LocalDate;

public class BookDTO {
    private String title ;
    private String author ;
    private String description ;
    private String cover ;
    private String genre ;
    private String language;
    private LocalDate dateOfPublication ;
    private String publisher ;
    private String link ;

    public BookDTO(){}

    public BookDTO(String title, String author, String description, String cover, String genre, String language, LocalDate dateOfPublication, String publisher, String link) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.cover = cover;
        this.genre = genre;
        this.language = language;
        this.dateOfPublication = dateOfPublication;
        this.publisher = publisher;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public LocalDate getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(LocalDate dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Book toEntity(){
        Book book = new Book();
        book.setTitle(this.getTitle()) ;
        book.setAuthor(this.getAuthor()) ;
        book.setDescription(this.getDescription()) ;
        book.setCover(this.getCover()) ;
        book.setGenre(Genre.valueOf(this.getGenre()));
        book.setLanguage(this.getLanguage());
        book.setDateOfPublication(this.getDateOfPublication()) ;
        book.setPublisher(this.getPublisher()) ;
        book.setLink(this.getLink()) ;
        return book;
    }
}
