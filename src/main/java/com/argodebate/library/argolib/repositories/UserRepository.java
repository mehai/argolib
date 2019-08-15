package com.argodebate.library.argolib.repositories;

import com.argodebate.library.argolib.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}