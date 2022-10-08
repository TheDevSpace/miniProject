package net.alterapp.miniproject3.service;

import net.alterapp.miniproject3.domain.Project;

import java.util.List;

public interface ProjectService {
    Project add(Project project);

    List<Project> findAll();
}
