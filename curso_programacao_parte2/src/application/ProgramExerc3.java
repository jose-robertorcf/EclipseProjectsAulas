package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramExerc3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter the name of the student and your three grades:");
		
		student.name = sc.nextLine();
		
		student.n1 = sc.nextDouble();
		student.n2 = sc.nextDouble();
		student.n3 = sc.nextDouble();
		
		System.out.println(student);
		
		
		
		
		
		
		sc.close();

	}

}
