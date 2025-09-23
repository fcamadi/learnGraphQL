package org.francd.controller;

import org.francd.model.Book;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    @QueryMapping  // It registers the method as a DataFetcher,
    List<Book> books() {
        return List.of(
                new Book("1", "Dune", "Frank Herbert"),
                new Book("2", "Ubik", "Philip K. Dick"),
                new Book("3", "Ancillary Justice", "Ann Leckie")
        );
    }

}
