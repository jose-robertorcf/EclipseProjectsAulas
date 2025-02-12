package entities;

public class Employee {
	
	public String name;
	public double GrossSalary;
	public double Tax;
	
	
	public double netSalary() {
		return this.GrossSalary - this.Tax;
	}
	
	public void increaseSalary(double percentage) {
		this.GrossSalary *= (percentage/100) + 1;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}

}
