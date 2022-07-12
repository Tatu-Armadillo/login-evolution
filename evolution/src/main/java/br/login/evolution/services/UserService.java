package br.login.evolution.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.login.evolution.models.User;
import br.login.evolution.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public User successLogin(User user) {
        User login = this.userRepository.loginUser(user.getUsername(), user.getPassword());
        return login;     
    }

}
