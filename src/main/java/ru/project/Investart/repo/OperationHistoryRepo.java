package ru.project.Investart.repo;

import org.springframework.data.repository.CrudRepository;
import ru.project.Investart.entity.OperationHistory;
import ru.project.Investart.entity.Startup;

public interface OperationHistoryRepo extends CrudRepository<OperationHistory,Long> {

}
