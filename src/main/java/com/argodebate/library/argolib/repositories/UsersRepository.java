package com.argodebate.library.argolib.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.argodebate.library.argolib.entities.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
	User findByEmail(String email);
}