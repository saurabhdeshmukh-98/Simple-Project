package com.service;

import java.util.ArrayList;
import java.util.List;

import com.entity.Employee;
import com.serviceClass.EmployeeMethod;

import java.util.Scanner;

public class EmployeeService {
	static Integer idCount = 0;

	
	public static void main(String[] args) {

		
		Integer id = null;
		String name = null;
		Double salary = null;
		String address = null;
		String departmentName = null;
		int count = 0;
		int n = 0;

		EmployeeService method=new EmployeeService();
        EmployeeMethod employeeMethod=new EmployeeMethod();
		ArrayList<Employee> emp =new ArrayList<>();

		do {
			 Scanner sc = new Scanner(System.in);
			System.out.println("/n---------Employee management system---------\n");
			System.out.println("1.add employee\n" + "2.getAllEmployee\n" + "3.getEmpById" + "4.updateById"
					+ "5.deleteById" + "6.deletall" + "7.exit");

			System.out.println("Enter your choice:");
			int ch = sc.nextInt();
  
			switch (ch) {
			case 1:
			employeeMethod.employeeDetails(idCount,name,salary,departmentName,address,sc,emp);
			break;

			case 2:
				employeeMethod.getAllDetails(emp);
				break;
			
			case 3:
				employeeMethod.enterAll(id,sc,emp);
				break;
				

			case 4:
                   employeeMethod.updateById(id, sc, emp, address, name, ch, departmentName);				
			case 5:
				employeeMethod.deleteById(id, sc, emp);
				break;

			case 6:
				employeeMethod.deleteAll(emp);
				break;
				
	    	case 7:
				System.out.println("Exit from Console");
				System.exit(0);
				break;

			default:
				System.out.println("invalid choise");
				break;
			}
		} while (true);

	}

}
