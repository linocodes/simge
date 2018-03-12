package br.gov.mg.meioambiente.simge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.mg.meioambiente.simge.entity.Employee;


/**
 * 
 * @author BytesTree
 *
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}