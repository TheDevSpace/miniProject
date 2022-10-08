package net.alterapp.miniproject3.service.impl;
;
import lombok.RequiredArgsConstructor;
import net.alterapp.miniproject3.domain.Project;
import net.alterapp.miniproject3.repo.ProjectRepo;
import net.alterapp.miniproject3.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepo projectRepo;

    @Override
    public Project add(Project project) {
        return projectRepo.save(project);
    }

    @Override
    public List<Project> findAll() {
        return projectRepo.findAllByDeletedAtIsNull();
    }

}
