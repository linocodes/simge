package br.gov.mg.meioambiente.simge.repository;

import org.springframework.stereotype.Repository;

import br.gov.mg.meioambiente.simge.entity.Employee;

@Repository
public interface EmployeeRepository extends BaseRepository<Employee, Long> {

}