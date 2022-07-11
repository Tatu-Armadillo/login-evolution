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
        List<User> listUsers = this.userRepository.findAll();
        listUsers.removeIf(userDb -> !(userDb.getUsername().equals(user.getUsername()) && userDb.getPassword().equals(user.getPassword())));
        if (listUsers.isEmpty()) {
            return null;
        }
        return listUsers.get(0);     
    }

}
