/*
 * Copyright (C) 2015 by Dr James R Cooper
 * All Rights Reserved.
 */
package cooper.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Reader {

    @Id
    private String readerId;

    private String name;
    private String nickname;

    private List<Book> books;

    public Reader() {
        this.books = new ArrayList<Book>();
    }

    public Reader(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
        this.books = new ArrayList<Book>();
    }

    public String getReaderId() {
        return readerId;
    }

    public String getName() {
        return name;
    }

    public Reader setName(String name) {
        this.name = name;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public Reader setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Reader addBook(final Book book) {
        this.books.add(book);
        return this;
    }

    public Reader addBook(final List<Book> books) {
        this.books.addAll(books);
        return this;
    }
}
