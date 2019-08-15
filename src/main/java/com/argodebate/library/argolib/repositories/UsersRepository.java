package com.argodebate.library.argolib.repositories;

import com.argodebate.library.argolib.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, Integer> {
}