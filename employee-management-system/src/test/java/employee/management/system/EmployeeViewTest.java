package employee.management.system;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeViewTest {

	private EmployeeView employeeView= new EmployeeView();
	
	@Test
	public void employeeViewTest() {
		
		Employee savedEmployee = employeeView.employeeView();
		
		assertEquals("Gayathri", savedEmployee.getFirstName());
		assertEquals("Kasi", savedEmployee.getLastName());
	}
}
