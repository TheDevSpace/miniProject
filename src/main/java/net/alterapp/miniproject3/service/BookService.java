package net.alterapp.miniproject3.service;

import net.alterapp.miniproject3.domain.Book;
import net.alterapp.miniproject3.domain.Customer;
import net.alterapp.miniproject3.domain.Library;
import net.alterapp.miniproject3.domain.Order;
import net.alterapp.miniproject3.repository.BookRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class BookService {
    private final BookRepo bookRepo;
    private final LibraryService libraryService;
    private final OrderService orderService;

    public BookService(BookRepo bookRepo, LibraryService libraryService, OrderService orderService) {
        this.bookRepo = bookRepo;
        this.libraryService = libraryService;
        this.orderService = orderService;
    }

    public List<Book> findAll() {
        return bookRepo.findAllByDeletedAtIsNull();
    }

    public Book findById(long id) {
        return bookRepo.findByIdAndDeletedAtIsNull(id);
    }

    public Book add(Book book) {
        Library library = libraryService.findById(book.getLibrary().getId());
        if (library == null) {
            System.out.println("There is no Library with id = " + book.getLibrary().getId());
        } else {
            bookRepo.save(book);
        }
        return book;
    }

    public String update(Long id, String title, String author, String ganre, int pagesAmount) {
        Book book = bookRepo.findByIdAndDeletedAtIsNull(id);
        book.setTitle(title);
        book.setAuthor(author);
        book.setGanre(ganre);
        book.setPagesAmount(pagesAmount);
        bookRepo.save(book);
        return "update";
    }

    public void delete(Long id) {
        Book book = bookRepo.findByIdAndDeletedAtIsNull(id);
        if (book != null) {
            Date date = new Date();
            book.setDeletedAt(date);
            bookRepo.save(book);
        }
    }

    public List<Book> findAllByLibrary(Long id) {
        List<Book> books = new ArrayList<>();
        Library library = libraryService.findById(id);
        if (library != null) {
            books = bookRepo.findAllByLibraryId(id);
        } else {
            System.out.println("There is no Library with id = " + id);
        }
        return books;
    }
}