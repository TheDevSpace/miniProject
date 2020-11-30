package net.alterapp.miniproject3.controller;

import net.alterapp.miniproject3.domain.Library;
import net.alterapp.miniproject3.domain.requests.LibraryRequest;
import net.alterapp.miniproject3.service.LibraryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
@RestController
@RequestMapping("/api/library")
public class LibraryController extends BaseController{
    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> getAll() {
        return buildResponse(libraryService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/id")
    public ResponseEntity<?> getById(@RequestParam Long id) {
        return buildResponse(libraryService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/id/response")
    public ResponseEntity<?> getByIdResponse(@RequestParam Long id) {
        return buildResponse(libraryService.findByIdResponse(id), HttpStatus.OK);
    }

    @PostMapping(value = "/add/v1")
    public ResponseEntity<?> add(@RequestParam String name,
                                 @RequestParam String city,
                                 @RequestParam String phone) {
        Library library = new Library();
        library.setName(name);
        library.setCity(city);
        library.setAddress("address");
        library.setPhone(phone);

        return buildResponse(libraryService.add(library), HttpStatus.OK);
    }

    @PostMapping(value = "/add/v2")
    public ResponseEntity<?> add(@RequestBody Library library) {
        return buildResponse(libraryService.add(library), HttpStatus.OK);
    }

    @PostMapping("/add/v3")
    public ResponseEntity<?> addReq(@RequestBody LibraryRequest libraryRequest) {
        return buildResponse(libraryService.addReq(libraryRequest), HttpStatus.OK);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<?> updateLibrary(@RequestParam Long id,
                                           @RequestParam String name,
                                           @RequestParam String city) {
        return buildResponse(libraryService.update(id, name, city), HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<?> delete(@RequestParam(value = "city") String city) {
        libraryService.delete(city);
        return buildResponse("Deleted", HttpStatus.OK);
    }
}


