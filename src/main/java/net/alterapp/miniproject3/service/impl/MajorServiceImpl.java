package net.alterapp.miniproject3.service.impl;

import lombok.RequiredArgsConstructor;
import net.alterapp.miniproject3.domain.*;

import net.alterapp.miniproject3.repo.MajorRepo;
import net.alterapp.miniproject3.repo.ProfessorRepo;
import net.alterapp.miniproject3.repo.ProjectRepo;
import net.alterapp.miniproject3.service.ContactService;
import net.alterapp.miniproject3.service.MajorService;
import net.alterapp.miniproject3.service.ProfessorService;
import net.alterapp.miniproject3.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MajorServiceImpl implements MajorService {
    private final ProfessorRepo professorRepo;
    private final ProjectRepo projectRepo;
    private final ProfessorService professorService;
    private final StudentService studentService;
    private final ContactService contactService;
    private final MajorRepo majorRepo;

    @Override
    public Major findById(Long id) {
        return majorRepo.findByIdAndDeletedAtIsNull(id);
    }

    @Override
    public Major addMajor(Major major) {
        return majorRepo.save(major);
    }

    @Override
    public String updateAll(Long id, String name, Integer year) {
        Major major = majorRepo.findByIdAndDeletedAtIsNull(id);
        major.setName(name);
        major.setYear(year);
        majorRepo.save(major);
        return "updated all";
    }

    @Override
    public String delete(Long id) {
        Date date = new Date();
        Major major = majorRepo.findByIdAndDeletedAtIsNull(id);
        major.setDeletedAt(date);
        majorRepo.save(major);
        return "deleted";
    }

    @Override
    public List<Major> findAll() {
        return majorRepo.findAllByDeletedAtIsNull();
    }
}
