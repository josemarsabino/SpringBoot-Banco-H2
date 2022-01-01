package br.com.sada.userdept.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sada.userdept.model.Department;
import br.com.sada.userdept.repository.DepartmentRepository;

@RestController
@RequestMapping(value = "/departments")
public class DepartamentController {

	@Autowired
	DepartmentRepository departRepository;

	public List<Department> listarTodos() {
		List<Department> result = departRepository.findAll();
		return result;
	}

}
