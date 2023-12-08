package com.bhas.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorEx 
{

	public static void main(String[] args) 
	{
		// arrayList to store values,
		List<Employee> empList = new ArrayList<>();
		
						empList.add(new Employee("Bhaskar K", 25, 95000.00));
						empList.add(new Employee("Nandi", 3, 5000.00));
						empList.add(new Employee("Gowri", 5, 85000.00));
						empList.add(new Employee("Gani", 6, 75000.00));
						
		// getMaxSalary,
						Employee maxSal = empList.parallelStream().collect(Collectors.maxBy(Comparator.comparing(Employee::getEmpSalary))).get();
						System.out.println("Maximum salary in the list,"+maxSal.getEmpSalary()+"-"+maxSal.getEmpName());
	}

}
