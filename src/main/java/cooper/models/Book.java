/*
 * Copyright (C) 2015 by Dr James R Cooper
 * All Rights Reserved.
 */
package cooper.models;

import org.springframework.data.annotation.Id;

public class Book {

    @Id
    private String bookId;

    private String title;
    private String author;

    private long pages;

    private String review;

    public Book() {
    }

    public Book(String title, String author, long pages, String review) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.review = review;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public long getPages() {
        return pages;
    }

    public Book setPages(long pages) {
        this.pages = pages;
        return this;
    }

    public String getReview() {
        return review;
    }

    public Book setReview(String review) {
        this.review = review;
        return this;
    }
}
