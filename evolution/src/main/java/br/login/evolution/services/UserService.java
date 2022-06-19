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

    public User successLogin(String username, String password) {
        List<User> listUsers = this.userRepository.findAll();
        listUsers.removeIf(user -> !(user.getUsername().equals(username) && user.getPassword().equals(password)));
        if (listUsers.isEmpty()) {
            return null;
        }
        return listUsers.get(0);     
    }

}
