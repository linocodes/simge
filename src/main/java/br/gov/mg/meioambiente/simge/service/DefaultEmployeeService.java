package br.gov.mg.meioambiente.simge.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.mg.meioambiente.simge.entity.Employee;
import br.gov.mg.meioambiente.simge.repository.EmployeeRepository;



/**
 * 
 * @author BytesTree
 *
 */
@Service
public class DefaultEmployeeService implements EmployeeService {
	

	/*

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee save(Employee entity) {
		return employeeRepository.save(entity);
	}

	@Override
	public Employee getById(Serializable id) {
		return employeeRepository.findOne((Long) id);
	}

	@Override
	public List<Employee> getAll() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public void delete(Serializable id) {
		employeeRepository.delete((Long) id);
	}

	@Override
	public Employee create(Employee entity) {
		// TODO Auto-generated method stub
		return null;
	}
	*/

}