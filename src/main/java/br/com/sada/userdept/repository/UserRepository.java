package br.com.sada.userdept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sada.userdept.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
