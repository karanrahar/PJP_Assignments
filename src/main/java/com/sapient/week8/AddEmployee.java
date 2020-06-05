package com.sapient.week8;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	private List<Employee> list;

	public AddEmployee() {
		this.list = new ArrayList<Employee>();
	}
	void addEmployee(Employee ob) {
		list.add(ob);
	}
	
	Employee getEmployee(int id) {
		for(Employee emp : list) {
			if(emp.getId() == id)
				return emp;
		}
		return null;
	}
	public List<Employee> getList() {
		return list;
	}
	
}
