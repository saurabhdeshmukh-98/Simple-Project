package com.entity;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private String address;
	private String departmentNmae;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary, String address, String departmentNmae) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.departmentNmae = departmentNmae;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartmentNmae() {
		return departmentNmae;
	}

	public void setDepartmentNmae(String departmentNmae) {
		this.departmentNmae = departmentNmae;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", departmentNmae=" + departmentNmae + "]";
	}

}
