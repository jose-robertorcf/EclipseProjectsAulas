package curso_programacao;

import java.util.Scanner;

public class ExerciciosWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		/*
		Exercício 1
		
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Inválida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		*/
		
		/*
		Exercício 2
		
		int x, y;

		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != 0 || y!= 0) {
			
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if(x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if(x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else if(x > 0 && y < 0) {
				System.out.println("quarto");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
				
		}
		
		*/
		
		/*
		Exercício 3
		
		int tipo = sc.nextInt();
		int alcool = 0, gasolina = 0, diesel = 0;
		
		while(tipo != 4) {
			switch(tipo) {
			case 1:
				alcool ++;
				tipo = sc.nextInt();
				break;
			case 2:
				gasolina ++;
				tipo = sc.nextInt();
				break;
			case 3:
				diesel ++;
				tipo = sc.nextInt();
				break;
			default:
				tipo = sc.nextInt();
				break;
			}
		}
		
		System.out.println("Muito obrigado!");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		*/
		
		
		
		
		
		
		sc.close();
				

	}

}
