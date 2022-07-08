package br.login.evolution.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.login.evolution.models.User;
import br.login.evolution.services.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String getSuccessLogin(@RequestParam String username, @RequestParam String password) {
        String success = this.userService.successLogin(username, password);
        return success;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }
    
}
