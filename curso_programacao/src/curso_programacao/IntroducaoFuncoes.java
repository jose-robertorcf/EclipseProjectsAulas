package curso_programacao;

import java.util.Scanner;

public class IntroducaoFuncoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		/*
		if (a > b && a > c) {
			System.out.println("Higher: " + a);
		}
		else if(b > c) {
			System.out.println("Higher: " + b);
		}
		else {
			System.out.println("Higher: " + c);
		}
		
		*/
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
			
		sc.close();

	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && y > z) {
			aux = x;
		}
		else if(y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
