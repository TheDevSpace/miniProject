package net.alterapp.miniproject3.service;

import net.alterapp.miniproject3.domain.Library;
import net.alterapp.miniproject3.repository.LibraryRepo;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LibraryService {
    private final LibraryRepo libraryRepo;

    public LibraryService(LibraryRepo libraryRepo) {
        this.libraryRepo = libraryRepo;
    }

    public List<Library> findAll(){
        return libraryRepo.findAllByDeletedAtIsNull();
    }

    public Library findById(long id) {
        return libraryRepo.findByIdAndDeletedAtIsNull(id);
    }

    public Library add(Library library) {
        return libraryRepo.save(library);
    }

    public String update(Long id, String name, String city) {
        Library library = libraryRepo.findByIdAndDeletedAtIsNull(id);
        library.setName(name);
        library.setCity(city);
        libraryRepo.save(library);
        return "updated";
    }

    public void delete(Long id) {
        Library library = libraryRepo.findByIdAndDeletedAtIsNull(id);
        if(library!=null) {
            Date date = new Date();
            library.setDeletedAt(date);
            libraryRepo.save(library);
        }
    }

}