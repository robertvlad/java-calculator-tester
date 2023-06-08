package org.java.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class EmployeeTest {
	
	@Test
	public void employeeCostructo() throws Exception {
		
		Employee e = new Employee("Hugo", "Banana", "Boss", "01-01-1990");
		assertNotNull(e);
	}
	
	@Test
	public void employeeEmptyNameCostructo() throws Exception {
		
		assertThrows(Exception.class, 
				() -> new Employee(null, "Banana", "Boss", "01-01-1990")
		);
	}
	
	@Test
	public void employeeEmptyLastnameCostructo() throws Exception {
		
		assertThrows(Exception.class, 
				() -> new Employee("Hugo", null, "Boss", "01-01-1990")
		);
	}
	
	@Test
	public void employeeWrongRoleCostructo() throws Exception {
		
		assertThrows(Exception.class, 
				() -> new Employee("Hugo", "Banana", "Salesman", "01-01-1990")
		);
	}
	
	@Test
	public void employeeDateInTheFutureCostructo() throws Exception {
		
		assertThrows(Exception.class, 
				() -> new Employee("Hugo", "Banana", "Boss", "01-01-2030")
		);
	}
}
