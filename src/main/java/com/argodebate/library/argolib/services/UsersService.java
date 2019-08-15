package com.argodebate.library.argolib.services;

import com.argodebate.library.argolib.entities.User;
import com.argodebate.library.argolib.repositories.UsersRepository;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Iterable<User> findAll() {
        return usersRepository.findAll();
    }

    public User findById(int id) {
        return usersRepository.findById(id).get();
    }

    public void save(User user) {
        usersRepository.save(user);
    }

    public void deleteById(int id) {
        usersRepository.deleteById(id);
    }
}
