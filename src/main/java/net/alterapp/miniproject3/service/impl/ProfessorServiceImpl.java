package net.alterapp.miniproject3.service.impl;


import lombok.RequiredArgsConstructor;
import net.alterapp.miniproject3.domain.Professor;
import net.alterapp.miniproject3.repo.ProfessorRepo;
import net.alterapp.miniproject3.service.ProfessorService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class ProfessorServiceImpl implements ProfessorService {

    private final ProfessorRepo professorRepo;

    @Override
    public Professor add(Professor professor) {
        return professorRepo.save(professor);
    }

    @Override
    public Professor findById(long id) {
        return professorRepo.findByIdAndDeletedAtIsNull(id);
    }

    @Override
    public Professor findByName(String name) {
        return professorRepo.findByNameAndDeletedAtIsNull(name);
    }

    @Override
    public String delete(long id) {
        Date date = new Date();
        Professor professor = professorRepo.findByIdAndDeletedAtIsNull(id);
        professor.setDeletedAt(date);
        professorRepo.save(professor);
        return "deleted";
    }
}
