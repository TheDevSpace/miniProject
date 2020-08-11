package net.alterapp.miniproject3.controller;

import net.alterapp.miniproject3.domain.Book;
import net.alterapp.miniproject3.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
public class BookController extends BaseController {
    private final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> getAll() {
        return buildResponse(bookService.findAll(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getById(@RequestParam Long id) {
        return buildResponse(bookService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Book book) {
        return buildResponse(bookService.add(book), HttpStatus.OK);
    }

    @GetMapping("/library")
    public ResponseEntity<?> getAllByLibraryId(@RequestParam Long id) {
        return buildResponse(bookService.findAllByLibrary(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
        bookService.delete(id);
        return buildResponse("Deleted", HttpStatus.OK);
    }

    @GetMapping("/av")
    public ResponseEntity<?> listAvailableBooks() {
        return buildResponse(bookService.getAvailableBooks(), HttpStatus.OK);
    }
}


