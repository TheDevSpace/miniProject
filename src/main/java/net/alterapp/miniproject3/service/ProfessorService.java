package net.alterapp.miniproject3.service;

import net.alterapp.miniproject3.domain.Professor;

public interface ProfessorService {
    Professor add(Professor professor);

    Professor findById(long id);

    String delete(long id);

    Professor findByName(String name);
}
