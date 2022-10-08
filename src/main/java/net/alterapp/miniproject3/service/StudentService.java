package net.alterapp.miniproject3.service;

import net.alterapp.miniproject3.domain.Student;

import java.util.List;

public interface StudentService {
    Student add(Student student);

    Student findById(long id);

    List<Student> findAll();
}
