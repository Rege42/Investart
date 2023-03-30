package ru.project.Investart.repo;

import org.springframework.data.repository.CrudRepository;
import ru.project.Investart.entity.ProjectHistory;

public interface ProjectHistoryRepo extends CrudRepository<ProjectHistory,Long> {
}
