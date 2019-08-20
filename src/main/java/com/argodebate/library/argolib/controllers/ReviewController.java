package com.argodebate.library.argolib.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.argodebate.library.argolib.services.ReviewService;

@Controller
@RequestMapping(path = "/reviews")
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
}
