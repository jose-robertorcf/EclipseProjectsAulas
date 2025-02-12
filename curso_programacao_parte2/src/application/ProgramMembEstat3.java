package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorEst;

public class ProgramMembEstat3 {  //usando classe Calculator com membros estáticos
	
	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		
		double radius = sc.nextDouble();
		
		double c = CalculatorEst.circumference(radius);
		
		double v = CalculatorEst.volume(radius);
		
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI Value: %.2f%n", CalculatorEst.PI);

		sc.close();
	}
		
}
