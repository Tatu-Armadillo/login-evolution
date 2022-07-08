package br.login.evolution.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.login.evolution.models.User;
import br.login.evolution.services.UserService;
import br.login.evolution.utils.ResponseBase;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    final static String success = "Consulta realizada com sucesso";

    @GetMapping("/login")
    public ResponseEntity<ResponseBase<User>> getSuccessLogin(@RequestParam String username,
            @RequestParam String password) {
        final User user = this.userService.successLogin(username, password);
        final var response = new ResponseBase<User>(user, success, true);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/users")
    public ResponseEntity<ResponseBase<List<User>>> getAllUsers() {
        final var users = this.userService.getAllUsers();
        final var response = new ResponseBase<List<User>>(users, success, true);
        return ResponseEntity.ok(response);
    }

}
