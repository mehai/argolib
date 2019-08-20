package com.argodebate.library.argolib.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.argodebate.library.argolib.entities.User;
import com.argodebate.library.argolib.services.UsersService;

@Controller
@RequestMapping(path="/users")
public class UsersController {

    private UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }
    
    @GetMapping(path = "/register")
    public String registerPage(Model model, @ModelAttribute User user) {
    	return "register";
    }
    
    @PostMapping(path = "/register")
    @ResponseBody
    public String register(@ModelAttribute User user, BindingResult errors, Model model) {
    	usersService.save(user);
    	return "registered";
    }
    
    @GetMapping(path = "/login")
    public String loginPage(@ModelAttribute User user, Model model) {
    	return "login";
    }

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String firstName,
                                            @RequestParam String lastName,
                                            @RequestParam String email,
                                            @RequestParam String password) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        usersService.save(user);
        return "Saved";
    }

    @GetMapping(path="/all")
    public String getAllUsers(Model model) {
        model.addAttribute("users", usersService.findAll());
        return "users";
    }
}