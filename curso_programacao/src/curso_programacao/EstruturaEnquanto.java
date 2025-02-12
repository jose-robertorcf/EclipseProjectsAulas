package curso_programacao;

import java.util.Scanner;

public class EstruturaEnquanto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int x, soma = 0;
		
		x = sc.nextInt();
		
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
			
		}
		
		System.out.println(soma);
		
		
		
		
		
		sc.close();
		
		
		
		
		

	}

}
