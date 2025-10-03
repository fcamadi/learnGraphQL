package org.francd.service;

import org.francd.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    public List<Book> getBooks() {
        return List.of(
                new Book("1", "Dune", "Frank Herbert"),
                new Book("2", "Ubik", "Philip K. Dick"),
                new Book("3", "Ancillary Justice", "Ann Leckie")
        );
    }
}
