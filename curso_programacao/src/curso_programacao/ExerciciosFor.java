package curso_programacao;

import java.util.Scanner;

public class ExerciciosFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		/*
		Exercício 1
		
		int x = sc.nextInt();
		
		if (x <= 0 || x > 1000) {
			System.out.println("Fora do intervalo. O número deve estar entre 1 e 1000.");
		}
		
		else {
			for(int i = 0; i < x; i++) {
				if(i % 2 != 0) {
					System.out.println(i);
				}
			}
		}
		
		*/
		
		/*
		Exercício 2
		
		int n = sc.nextInt();
		
		int x = 0, in = 0, out = 0;
				
		for(int i = 0; i < n; i++) {
			x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				in ++;
			}
			else {
				out++;
			}
			
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		*/
		
		/*
		Exercício 3
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double n1, n2, n3, media;
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			
			media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
			System.out.printf("%.1f%n", media);
			
		}
		
		*/
		
		/*
		Exercício 4
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			double num, den, res;
			num = sc.nextInt();
			den = sc.nextInt();
			if (den == 0) {
				System.out.println("divisão impossível");
			}
			else {
				res = num / den;
				System.out.printf("%.1f%n", res);
			}
		}
		
		*/
		
		/*
		Exercício 5
		
		int n = sc.nextInt();
		int fat = 0;
				
		if (n == 0 || n == 1) {
			fat = 1;
			System.out.println(fat);
		}
		else {
			fat = n;
			for(int i = n - 1; i > 1; i--) {
				fat *= i; 
			}
			System.out.println(fat);
		}
		
		*/
		
		/*
		Exercício 6
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		
		*/
		
		/*
		Exercício 7
		
		int n = sc.nextInt();
		
		if(n > 0) {
			for(int i = 1; i <= n; i++) {
				System.out.println(i + " " + i*i  + " " + i*i*i);
			}
		}
		
		*/
		
		
		
		
		sc.close();

	}

}
