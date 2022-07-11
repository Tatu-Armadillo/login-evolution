package br.login.evolution.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.login.evolution.models.User;
import br.login.evolution.services.UserService;
import br.login.evolution.utils.ResponseBase;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    final static String success = "Consulta realizada com sucesso";

    @PostMapping("/login")
    public ResponseEntity<ResponseBase<User>> getSuccessLogin(@RequestBody User user) {
        final User userLog = this.userService.successLogin(user);
        final var response = new ResponseBase<User>(userLog, success, true);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/users")
    public ResponseEntity<ResponseBase<List<User>>> getAllUsers() {
        final var users = this.userService.getAllUsers();
        final var response = new ResponseBase<List<User>>(users, success, true);
        return ResponseEntity.ok(response);
    }

}
