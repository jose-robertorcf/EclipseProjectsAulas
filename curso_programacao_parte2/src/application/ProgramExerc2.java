package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramExerc2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Enter the employee data: ");
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		employee.GrossSalary = sc.nextDouble();
				
		System.out.print("Tax: ");
		employee.Tax = sc.nextDouble();
		System.out.println();
		
		System.out.println("Employee: " + employee);
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		
		sc.close();

	}

}
