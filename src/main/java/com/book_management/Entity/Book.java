package com.book_management.Entity;

import com.book_management.DTO.BookDTO;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id",updatable = false)
    private Integer Id;

    @Column(nullable=false)
    private String title ;

    @Column(nullable=false)
    private String author ;

    @Column(columnDefinition = "TEXT" , nullable=false)
    private String description ;

    @Column(nullable=false)
    private String cover ;

    @Enumerated(EnumType.STRING)
    private Genre genre ;

    @Column(nullable=false)
    private String language;

    @Column(nullable=false)
    private LocalDate dateOfPublication ;

    @Column(nullable=false)
    private String publisher ;

    @Column(nullable=false)
    private String link ;

    public Book(){}

    public Book(String title, String author, String description, String cover, Genre genre, String language, LocalDate dateOfPublication, String publisher, String link) {
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

    public Integer getId() {
        return Id;
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

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
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

    public BookDTO toDTO(){
        BookDTO bookDTO = new BookDTO();
        bookDTO.setTitle(this.getTitle()) ;
        bookDTO.setAuthor(this.getAuthor()) ;
        bookDTO.setDescription(this.getDescription()) ;
        bookDTO.setCover(this.getCover()) ;
        bookDTO.setGenre(this.getGenre().toString()) ;
        bookDTO.setLanguage(this.getLanguage());
        bookDTO.setDateOfPublication(this.getDateOfPublication()) ;
        bookDTO.setPublisher(this.getPublisher()) ;
        bookDTO.setLink(this.getLink()) ;
        return bookDTO;
    }
}