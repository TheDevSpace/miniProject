package net.alterapp.miniproject3.service.impl;

import lombok.RequiredArgsConstructor;
import net.alterapp.miniproject3.domain.Student;
import net.alterapp.miniproject3.repo.StudentRepo;
import net.alterapp.miniproject3.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepo clientRepo;

    @Override
    public Student add(Student student) {
        return clientRepo.save(student);
    }

    @Override
    public Student findById(long id) {
        return clientRepo.findByIdAndDeletedAtIsNull(id);
    }

    @Override
    public List<Student> findAll() {
        return clientRepo.findAllByDeletedAtIsNull();
    }
}
