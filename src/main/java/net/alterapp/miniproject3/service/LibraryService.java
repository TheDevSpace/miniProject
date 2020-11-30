package net.alterapp.miniproject3.service;

import net.alterapp.miniproject3.domain.Library;
import net.alterapp.miniproject3.domain.requests.LibraryRequest;
import net.alterapp.miniproject3.domain.response.LibraryResponse;
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

    public LibraryResponse findByIdResponse(long id) {
        Library library = libraryRepo.findByIdAndDeletedAtIsNull(id);
        LibraryResponse libraryResponse = new LibraryResponse(library.getName(), library.getPhone());
        return libraryResponse;
    }

    public Library add(Library library) {
        return libraryRepo.save(library);
    }

    public Library addReq(LibraryRequest libraryRequest) {
        Library library = new Library();
        library.setName(libraryRequest.getLibName());
        return libraryRepo.save(library);
    }

    public String update(Long id, String name, String city) {
        Library library = libraryRepo.findByIdAndDeletedAtIsNull(id);
        library.setName(name);
        library.setCity(city);
        libraryRepo.save(library);
        return "updated";
    }

    public void delete(String city) {
        List<Library> libraries = libraryRepo.findAllByCityAndDeletedAtIsNull(city);
        if(libraries.size()>0){
            for(Library library : libraries){
                Date date = new Date();
                library.setDeletedAt(date);
                libraryRepo.save(library);
            }
        }


//        if(library!=null) {
//            Date date = new Date();
//            library.setDeletedAt(date);
//            libraryRepo.save(library);
//        }
    }

}