package com.argodebate.library.argolib.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.argodebate.library.argolib.services.BookService;

@Controller
@RequestMapping(path = "/books")
public class BookController {

	@Autowired
	private BookService bookService;
	

}
