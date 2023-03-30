package ru.project.Investart.repo;

import org.springframework.data.repository.CrudRepository;
import ru.project.Investart.entity.Investor;

public interface InvestorRepo extends CrudRepository<Investor,Long> {
}
