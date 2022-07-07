package ui;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import domein.Employee;

public class ProcessingEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employees = {
		         new Employee("Jason", "Red", 5000, "IT"),
		         new Employee("Ashley", "Green", 7600, "IT"),
		         new Employee("Matthew", "Indigo", 3587.5, "Sales"),
		         new Employee("James", "Indigo", 4700.77, "Marketing"),
		         new Employee("Luke", "Indigo", 6200, "IT"),
		         new Employee("Jason", "Blue", 3200, "Sales"),
		         new Employee("Wendy", "Brown", 4236.4, "Marketing")};
		
		List<Employee> employeeList = Arrays.asList(employees);
		
		System.out.println("complete employee list:");
		employeeList.stream()
		            .forEach(System.out::println);
		
		Predicate<Employee> fourToSixThousand = e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);
		
		System.out.printf("%nEmployees earning 4-6 per month sorted by salary: %n");
		
		employeeList.stream()
		    .filter(fourToSixThousand)
		    .sorted(Comparator.comparing(Employee::getSalary))
		    .forEach(System.out::println);
		
		//first employee
		System.out.printf("%nfirst employee:%n%s%n", employeeList.stream()
				                                                 .filter(fourToSixThousand)
				                                                 .findFirst()
				                                                 .get());
		
		Function<Employee, String> byFirstName = Employee::getFirstName;
		Function<Employee, String> byLastName = Employee::getLastName;
		
		Comparator<Employee> lastThenFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);
		
		System.out.printf("%nEmployees in ascending order by last name then first: %n");
		
		employeeList.stream()
		            .sorted(lastThenFirst)
		            .forEach(System.out::println);
		
		System.out.printf("%nUnique employee last names:%n");
		employeeList.stream()
		            .map(Employee::getLastName)
		            .distinct()
		            .sorted()
		            .forEach(System.out::println);
		
		System.out.printf("%nSum of employees' salaries (via sum method): %.2f%n", employeeList.stream()
				 																			   .mapToDouble(Employee::getSalary)
				 																			   .sum());
		

	}

}
