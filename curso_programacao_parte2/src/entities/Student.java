package entities;

public class Student {
	
	public String name;
	public double n1, n2, n3;
	
	public double finalGrade() {
		return n1 + n2 + n3;
	}
	
	public String toString() {
		if(finalGrade()>=60) {
			return "FINAL GRADE = " + String.format("%.2f%n", finalGrade()) + "PASS";
		}
		else {
			return "FINAL GRADE = " + String.format("%.2f%n", finalGrade()) + "FAILED" + String.format("%n") + "MISSING " + (60 - finalGrade()) + " POINTS";
		}
	}
	
	
	
	
}
