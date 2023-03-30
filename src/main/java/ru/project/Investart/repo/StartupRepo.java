package ru.project.Investart.repo;

import org.springframework.data.repository.CrudRepository;
import ru.project.Investart.entity.Startup;

public interface StartupRepo extends CrudRepository<Startup,Long> {

    Startup findStartupById(Long id);
}
