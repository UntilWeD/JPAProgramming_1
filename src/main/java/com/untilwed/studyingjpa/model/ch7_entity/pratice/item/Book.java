package com.untilwed.studyingjpa.model.ch7_entity.pratice.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("B")
public class Book extends ItemP7{

    private String author;
    private String isbn;

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
