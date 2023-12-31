package com.bhas.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class ComparatorEx 
{

	public static void main(String[] args) 
	{
		// ArrayList to store employees,
		List<Employee> empList = new ArrayList<>();
		
						empList.add(new Employee("Bhaskar K", 25, 95000.00));
						empList.add(new Employee("Nandi", 3, 5000.00));
						empList.add(new Employee("Gowri", 5, 85000.00));
						empList.add(new Employee("Gani", 6, 75000.00));
						empList.add(new Employee("Santhana", 1, 95000.00));
						
		// getMaxSalary,
						Employee maxSal = empList.parallelStream().collect(Collectors.maxBy(Comparator.comparing(Employee::getEmpSalary))).get();
						Employee minSal0 = empList.stream().sorted(Comparator.comparing(Employee::getEmpSalary)).findFirst().get();
						System.out.println("Maximum salary in the list,"+maxSal.getEmpSalary()+"-"+maxSal.getEmpName()+"-"+minSal0.getEmpSalary());
	
	   // getMinSalary,
						Employee minSal = empList.stream().min(Comparator.comparing(Employee::getEmpSalary)).get();
						Employee minSal1 = empList.parallelStream().collect(Collectors.minBy(Comparator.comparing(Employee::getEmpSalary))).get();
						Employee minSal2 = empList.stream().sorted(Comparator.comparing(Employee::getEmpSalary)).findFirst().get();
						System.out.println("Minimun salary in the list,"+minSal.getEmpSalary()+"-"+minSal.getEmpName()+"&"+minSal1.getEmpSalary()+"-"+minSal2.getEmpName());
	
						Spliterator<Employee> spliterator = empList.stream().spliterator();
						System.out.println(spliterator.getExactSizeIfKnown());
						System.out.println(spliterator.getComparator());
	
	}

}
