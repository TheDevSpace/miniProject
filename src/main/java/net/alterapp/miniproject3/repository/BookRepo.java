package net.alterapp.miniproject3.repository;

import net.alterapp.miniproject3.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
    List<Book> findAllByDeletedAtIsNull();
    Book findByIdAndDeletedAtIsNull(Long id);
    List<Book> findAllByLibraryId(Long id);
    List<Book> findAllByAvailableBook(Integer status);
}
