package br.gov.mg.meioambiente.simge.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee extends BaseModel {

	private static final long serialVersionUID = 4910225916550731446L;

	@Column(name = "firstname", length = 50)
	private String firstname;

	@Column(name = "lastname", length = 50)
	private String lastname;

	@Column(name = "designation", length = 20)
	private String designation;

	@Column(name = "salary")
	private Integer salary;

	public Employee() {
	}

	public Employee(Long id, String firstname, String lastname, String designation, Integer salary) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.designation = designation;
		this.salary = salary;
	}

	public Employee(String firstname, String lastname, String designation, Integer salary) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.designation = designation;
		this.salary = salary;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Integer getSalary() {
		return this.salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

}