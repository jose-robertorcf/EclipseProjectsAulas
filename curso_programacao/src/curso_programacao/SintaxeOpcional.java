package curso_programacao;

import java.util.Scanner;

public class SintaxeOpcional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		Operadores de atribuição
		
		int minutos;
		
		double conta = 50.0;
		
		System.out.println("Quantos minutos foram utilizados no mês?");
		
		minutos = sc.nextInt();
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0; //a += b -> a = a + b ---- += -= *= /= %b
		}
		
		System.out.printf("Valor a pagar: R$ %.2f", conta);
		
		*/
		
		
		/*
		Switch-case
		
		int x;
		String dia;
		
		System.out.println("Digite o dia da semana:");
		
		x = sc.nextInt();
		
		switch(x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda-feira";
			break;
		case 3:
			dia = "terça-feira";
			break;
		case 4:
			dia = "quarta-feira";
			break;
		case 5:
			dia = "quinta-feira";
			break;
		case 6:
			dia = "sexta-feira";
			break;
		case 7:
			dia = "sábado";
			break;
		default:
			dia = "valor inválido";
			break;
		}
		
		System.out.println(dia);
		
		*/
		
		/*
		Expressão condicional ternária
		
		
		double preco = 34.5;
		double desconto;
		
		desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
		*/
		
		
		sc.close();
		
		
		
	}

}
