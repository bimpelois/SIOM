package data.repository;

import data.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository{
    Optional<User> findById(int userId);

    Optional<User> findByEmail(String email);

    List<User> findAll();

    User save(User user);

    void deleteById(int userId);

    boolean existsByEmail(String email);
}

