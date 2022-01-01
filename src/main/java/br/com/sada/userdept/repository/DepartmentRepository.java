package br.com.sada.userdept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sada.userdept.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
