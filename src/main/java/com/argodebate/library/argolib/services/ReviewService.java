package com.argodebate.library.argolib.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.argodebate.library.argolib.repositories.ReviewRepository;

@Service
public class ReviewService {
	@Autowired
	private ReviewRepository reviewRepository;
}
