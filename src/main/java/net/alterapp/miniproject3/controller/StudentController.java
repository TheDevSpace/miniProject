package net.alterapp.miniproject3.controller;

import lombok.RequiredArgsConstructor;
import net.alterapp.miniproject3.domain.Student;
import net.alterapp.miniproject3.service.StudentService;
import net.alterapp.miniproject3.service.impl.StudentServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/student")
public class StudentController extends BaseController {
    private final StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Student student ) {
        return buildResponse(studentService.add(student), HttpStatus.OK);
    }

    @GetMapping("/findById")
    public ResponseEntity<?> findById(@RequestParam long id) {
        return buildResponse(studentService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll() {
        return buildResponse(studentService.findAll(), HttpStatus.OK);
    }


}
