package com.naman.springbootgraphqlhandson.domain;

import java.util.List;
import java.util.Objects;

public record Book(
        Integer id,
        String name,
        Integer pageCount,
        Integer authorId
) {

    public static List<Book> books = List.of(
            new Book(1, "Harry Potter and the Philosopher's Stone", 223, 1),
            new Book(2, "The Hobbit", 310, 3),
            new Book(3, "1984", 328, 2),
            new Book(4, "To Kill a Mockingbird", 281, 1),
            new Book(5, "The Great Gatsby", 180, 2),
            new Book(6, "Moby Dick", 635, 2),
            new Book(7, "War and Peace", 1225, 3),
            new Book(8, "Pride and Prejudice", 279, 3),
            new Book(9, "The Catcher in the Rye", 214, 1),
            new Book(10, "The Lord of the Rings", 1178, 1),
            new Book(11, "Jane Eyre", 500, 3)
    );

    public static Book bookById(Integer id) {
        return books.stream()
                .filter(book -> Objects.equals(book.id, id))
                .findFirst()
                .orElse(null);
    }
}
