package com.argodebate.library.argolib.controllers;

import com.argodebate.library.argolib.entities.User;
import com.argodebate.library.argolib.services.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/users")
public class UsersController {

    private UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String firstName,
                                            @RequestParam String lastName,
                                            @RequestParam String email) {
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