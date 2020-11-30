package net.alterapp.miniproject3.repository;

import net.alterapp.miniproject3.domain.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepo extends JpaRepository<Library, Long>{
    List<Library> findAllByDeletedAtIsNull();
    Library findByIdAndDeletedAtIsNull(Long id);
    List<Library> findAllByCityAndDeletedAtIsNull(String city);

}
