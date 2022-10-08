package net.alterapp.miniproject3.service;

import net.alterapp.miniproject3.domain.Major;

import java.util.List;

public interface MajorService {
    Major findById(Long id);

    Major addMajor(Major major);

    String updateAll(Long id, String name, Integer year);

    String delete(Long id);

    List<Major> findAll();
}
