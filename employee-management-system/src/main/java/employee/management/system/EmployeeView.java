package employee.management.system;

import java.util.Scanner;

public class EmployeeView {

	private Scanner scan = new Scanner(System.in);

	public Employee employeeView() {
		Employee employee = new Employee();
		System.out.println("Enter First Name of employee\n ");
		String sFirstname = scan.next();
		employee.setFirstName(sFirstname);

		System.out.println("Enter Last Name of employee\n ");
		String lastName = scan.next();
		employee.setLastName(lastName);

		System.out.println("Enter salary of employee  ");
		double dblsalary = scan.nextDouble();
		employee.setSalary(dblsalary);

		System.out.println("Is  Employee present ");
		boolean isPresent = scan.nextBoolean();
		employee.setPresent(isPresent);

		System.out.println(" Enter Employee Id ");
		long employeeId = scan.nextInt();
		employee.setEmployeeId(employeeId);

		System.out.println(" Enter Year of Birth :");
		int yearOfBirth = scan.nextInt();
		employee.setYearOfBirth(yearOfBirth);

		return employee;
	}

	public void displayEmployee(Employee employee) {
		System.out.println("First Name :\n" + employee.getFirstName());
		System.out.println("Last Name :\n" + employee.getLastName());
		System.out.println("Salary :\n" + employee.getSalary());
		// System.out.println("Is Present :\n"+employee.isPresent());
		System.out.println("Employee ID:\n" + employee.getEmployeeId());
		System.out.println("Year of Birth:\n" + employee.getYearOfBirth());

		if (employee.isPresent()) {
			System.out.println(employee.getFirstName() + employee.getLastName()
					+ "  is very very good boy and he is working here as a SCEINTIST");
		} else {
			System.out.println(employee.getFirstName() + employee.getLastName() + "  is out of the Organisation now ");
		}

	}

	public static void main(String[] args) {

		EmployeeView empView = new EmployeeView();
		Employee employee = empView.employeeView();
		empView.displayEmployee(employee);

	}
}
