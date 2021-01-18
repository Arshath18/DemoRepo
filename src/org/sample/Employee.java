package org.sample;

import org.test.Client;

//Child
public class Employee {

	private void employeeId() {
		System.out.println("Employee id: 123");
	}

	public void employeeName() {
		System.out.println("Employee name: Amy");
	}

	public static void main(String[] args) {

		// Create obj for child--u can access parenmt as well
		Employee e = new Employee();
		e.employeeId();
		e.employeeName();

	}

}
