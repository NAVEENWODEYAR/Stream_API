package com.bhas.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeIMPL 
{
	static 
	{
		System.out.println("\nSolving Real Time Queries Using Java 8 ");
	}
	
	public static void main(String[] args)
	{
		List<Employee> employeeList = new ArrayList<>(50);
		
		// store the values for testing,
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		/*
		// Real Time Queries On employeeList,
		// 1. How many male and female employees are there in the organization?,
				System.out.println("*******\n Gender count");	
				Map<String, Long> genderCount = employeeList.parallelStream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
									System.out.println(genderCount);

		
		// 2. Print the name of all departments in the organization?,
				System.out.println("*******\n Departments");
				employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
	
		
		// 3. What is the average age of male and female employees?,
				System.out.println("*******\n Average age of Employees");	
				Map<String, Double> avgAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
						System.out.println(avgAge);
	

		// 4. Get the details of highest paid employee in the organization?,
				System.out.println("*******\n Highest Paid Employee");
				Employee highestPaidEmp = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();
				System.out.println(highestPaidEmp.getName());
	
		
		// 5. Get the names of all employees who have joined after 2015?,
				System.out.println("*******\n Employees joined after 2015");
				employeeList.stream().filter(emp -> emp.getYearOfJoining() >= 2015).map(Employee::getName).forEach(System.out::println);
				
		
		// 6. Count the number of employees in each department?,
				System.out.println("*******\n Employees count in departments");
				employeeList.parallelStream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())).entrySet().forEach(System.out::println);
		
		
		// 7. What is the average salary of each department?,
				System.out.println("*******\n Employees average salary in departments");
				employeeList.parallelStream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))).entrySet().forEach(System.out::println);
		
		
		// 8. Get the details of youngest male employee in the product development department?,
				System.out.println("*******\n Youngest male employee in Product Development");
				Employee youngestMale = employeeList.parallelStream().filter(emp ->emp.getDepartment() .equalsIgnoreCase("Product Development") && emp.getGender().equalsIgnoreCase("Male")).min(Comparator.comparing(Employee::getAge)).get();
				System.out.println(youngestMale.getName()+"-"+youngestMale.getAge());
	
		
		// 9. Who has the most working experience in the organization?,
				System.out.println("*******\n Seniormost Employees");
				Employee seniorMostEmployee = employeeList.parallelStream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining))).get();
				System.out.println(seniorMostEmployee.getYearOfJoining()+" "+seniorMostEmployee.getName());
	
		
		// 9.a Who has the most working experience in the organization?, using sorting,
				System.out.println("*******\n Senior Most Employees");
				Employee seniorMostEmp = employeeList.parallelStream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst().get();
				System.out.println(seniorMostEmp.getName());
	
		// 10. How many male and female employees are there in the sales and marketing team?,
				System.out.println("*******\n Employees count in Sales and Marketing Team");
					employeeList.parallelStream()
								.filter(emp ->emp.getDepartment().equalsIgnoreCase("Sales and Marketing"))
								.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()))
								.entrySet()
								.forEach(System.out::println);
		
		
		// 11. What is the average salary of male and female employees?,
				System.out.println("*******\n Average salary of employees");	
				employeeList.parallelStream()
							.collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)))
							.entrySet()
							.forEach(System.out::println);
	
		*/
		// 12. List down the names of all employees in each department?,
				System.out.println("*******\n Employees in each department");
				employeeList.parallelStream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().forEach(System.out::println);
	}

}
