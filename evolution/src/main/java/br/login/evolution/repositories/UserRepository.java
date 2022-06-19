package br.login.evolution.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.login.evolution.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
