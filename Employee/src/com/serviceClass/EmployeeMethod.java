package com.serviceClass;

import java.util.ArrayList;
import java.util.Scanner;

import com.entity.Employee;

public class EmployeeMethod {

	public void display(ArrayList<Employee> emp) {

		for (Employee employee : emp) {
			System.out.println(employee);
		}
	}

	public void employeeDetails(Integer idCount, String name, Double salary, String departmentName, String address,
			Scanner sc, ArrayList<Employee> emp) {
		System.out.println("\nEnter employee details:\n");

		System.out.println("Enter name:");
		name = sc.next();
		System.out.println("Enter address:");
		address = sc.next();
		System.out.println("Enter salary:");
		salary = sc.nextDouble();
		System.out.println("Enter departmentName:");
		departmentName = sc.next();
		emp.add(new Employee(idCount, name, salary, address, departmentName));
		idCount++;

	}

	public void getAllDetails(ArrayList<Employee> emp) {
		System.out.println("Getall Employee details-");
		display(emp);
	}

	public void enterAll(Integer id,Scanner sc,ArrayList<Employee> emp) {
		System.out.println("Enter employeeid-");
		id = sc.nextInt();
		int i = 0;

		for (Employee employee : emp) {
			if (id == employee.getId()) {
				System.out.println(employee + "\n");
				i++;
			}
			if (i == 0) {
				System.out.println("Employee not fount");
			}
		}

	}
	public void updateById(Integer id,Scanner sc,ArrayList<Employee> emp,String address,String name,double salary,String departmentName) {
		System.out.println("Enter id to Update");
		id = sc.nextInt();
		int j = 0;
		for (Employee employee : emp) {
			if (id == employee.getId()) {
				j++;
				do {
					System.out.println("\n edit employee details:\n");
					System.out.println("\n Enter your choise:\n" + "1.Employee id\n" + "2.name\n"
							+ "3.address\n" + "4.salary\n" + "5.departmentName\n" + "6.exit\n");
								System.out.println("enter your choise");
					int ch1 = sc.nextInt();
					switch (ch1) {
					case 1:
						System.out.println("Enter your new id:");
						id = sc.nextInt();
						break;
					case 2:
						System.out.println("Enter your new name:");
						name = sc.next();
						break;
					case 3:
						System.out.println("Enter your new address:");
						address = sc.next();
						break;
					case 4:
						System.out.println("Enter your new Salary:");
						salary = sc.nextDouble();
						break;
					case 5:
						System.out.println("Evoidnter your new departmentName:");
						departmentName = sc.next();
						break;
					case 6:
						j++;
						break;
					default:
						break;
						
					}
				} while (j == 1);

			}
		}

		
	}
	public void deleteById(Integer id,Scanner sc,ArrayList<Employee> emp) {
		System.out.println("delete employee by employee id");
		id = sc.nextInt();

		for (Employee employee : emp) {
			if (id == employee.getId()) {
				emp.remove(employee);
				break;
			}

		}
	}
	public void deleteAll(ArrayList<Employee> emp) {
	System.out.println("Delete all employee");
	emp.removeAll(emp);
	
		
	}
}
