package com.naman.springbootgraphqlhandson.controller;

import com.naman.springbootgraphqlhandson.domain.Author;
import com.naman.springbootgraphqlhandson.domain.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    @QueryMapping
    public List<Book> books() {
        return Book.books;
    }

    @QueryMapping
    public Book bookById(@Argument Integer id) {
        return Book.bookById(id);
    }

    @SchemaMapping  // This is a custom resolver method
    public Author author(Book book) {
        return Author.authorById(book.authorId());
    }

}
