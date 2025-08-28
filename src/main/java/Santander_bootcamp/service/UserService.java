package Santander_bootcamp.service;

import Santander_bootcamp.domain.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);

    List<User> findAll();

}
