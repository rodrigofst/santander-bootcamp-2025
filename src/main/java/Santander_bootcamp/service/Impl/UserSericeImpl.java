package Santander_bootcamp.service.Impl;

import Santander_bootcamp.domain.model.User;
import Santander_bootcamp.domain.repository.UserRepository;
import Santander_bootcamp.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserSericeImpl implements UserService {
    private final UserRepository userRepository;

    public UserSericeImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This account number already exists.");
        }
        return userRepository.save(userToCreate);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
