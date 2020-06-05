package com.sapient.week8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.*;

public class AddEmployeeTest {
	private AddEmployee addEmployee;
	private Employee employee;
	
	@Before
	public void setUp() throws Exception {
		addEmployee = new AddEmployee();
		employee = new Employee(1,"name","city");
		addEmployee.addEmployee(employee);
	}
	
	@Test												//add employee to list
	public void testAddEmployee() {
		int len = addEmployee.getList().size();
		addEmployee.addEmployee(new Employee(2, "Karan", "Delhi"));
		assertEquals(1, addEmployee.getList().size()-len);
	}
	
	@Test												//employee present
	public void testGetEmployee_ValidId() {
		Employee res = addEmployee.getEmployee(1);
		assertEquals(employee, res);
	}
	
	@Test												//employee not present
	public void testGetEmployee_InvalidId() {
		Employee res = addEmployee.getEmployee(3);
		assertNull(res);
	}
}
