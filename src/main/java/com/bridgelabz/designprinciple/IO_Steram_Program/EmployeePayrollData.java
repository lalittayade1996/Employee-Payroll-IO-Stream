package com.bridgelabz.designprinciple.IO_Steram_Program;

public class EmployeePayrollData {

	private String name;
	private int id;
	private double salary;

	public EmployeePayrollData(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePayrollData{" + "name='" + name + '\'' + ", id=" + id + ", salary=" + salary + '}';
	}
}