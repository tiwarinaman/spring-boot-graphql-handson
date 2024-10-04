package com.naman.springbootgraphqlhandson.domain;

import java.util.List;

public record Author(
        Integer id,
        String name
) {

    public static List<Author> authors = List.of(
            new Author(1, "Author One"),
            new Author(2, "Author Two"),
            new Author(3, "Author Three")
    );

    public static Author authorById(Integer id) {
        return authors.stream()
                .filter(author -> author.id().equals(id))
                .findFirst()
                .orElse(null);
    }

}
