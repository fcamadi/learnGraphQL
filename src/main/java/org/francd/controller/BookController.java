package org.francd.controller;

import org.francd.model.Book;
import org.francd.service.BookService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @QueryMapping  // It registers the method as a DataFetcher,
    List<Book> books() {
        return bookService.getBooks();
    }

}


/*


GraphiQL

http://localhost:8080/graphiql?path=/graphql

query myBooks {
  books {
    id
    name
    author
  }
}


 */