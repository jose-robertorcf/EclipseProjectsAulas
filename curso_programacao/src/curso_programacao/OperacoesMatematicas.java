package curso_programacao;

import java.util.Scanner;

public class OperacoesMatematicas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		
		double A, B, C;
		
		double delta, x1, x2;
		int a, b, c;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("Raíz quadrada de " + x + " = " + A);
		System.out.println("Raíz quadrada de " + y + " = " + B);
		System.out.println("Raíz quadrada de 25 = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		
		System.out.println("Vamos resolver uma equação de segundo grau. Digite os valores de a, b e c:");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		System.out.println("Delta = " + delta);
		
		x1 = (-b + Math.sqrt(delta))/(2.0*a);
		x2 = (-b - Math.sqrt(delta))/(2.0*a);
		
		System.out.println("As raízes da equação são: " + x1 + " e " + x2);
		
		sc.close();
	}

}
