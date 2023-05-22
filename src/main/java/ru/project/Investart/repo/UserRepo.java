package ru.project.Investart.repo;

import org.springframework.data.repository.CrudRepository;
import ru.project.Investart.entity.User;

public interface UserRepo extends CrudRepository<User,Long> {
    public User findUserByUsername(String username);

}
