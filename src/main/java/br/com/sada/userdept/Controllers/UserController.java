package br.com.sada.userdept.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sada.userdept.model.User;
import br.com.sada.userdept.repository.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@GetMapping
	public List<User> listarTodos() {
		List<User> result = userRepository.findAll();
		return result;

	}

	@GetMapping(value = "/{id}")
	public User buscarPorId(@PathVariable Long id) {
		User result = userRepository.findById(id).get();
		return result;

	}

	@PostMapping
	public User insert(@RequestBody User user) {
		User result = userRepository.save(user);
		return result;
	}

}
