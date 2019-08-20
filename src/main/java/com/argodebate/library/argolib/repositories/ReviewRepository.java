package com.argodebate.library.argolib.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.argodebate.library.argolib.entities.Review;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {

}
