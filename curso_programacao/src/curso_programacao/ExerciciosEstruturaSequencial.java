package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosEstruturaSequencial {

	public static void main(String[] args) {

		/*
		Exercício 1
		Scanner sc = new Scanner(System.in);

		int x, y, soma;

		System.out.println("Esse programa faz a soma de dois números inteiros. Digite-os:");

		x = sc.nextInt();
		y = sc.nextInt();

		soma = x + y;

		System.out.println("A soma de " + x + " + " + y + " = " + soma);

		sc.close();
		*/
		
		/*
		Exercício 2
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		double pi = 3.14159;
		
		System.out.println("Este programa calcula a área de um círculo a partir do seu raio. Digite o valor do raio:");
		
		raio = sc.nextDouble();
		
		area = pi * (Math.pow(raio,2.0));
		
		System.out.printf("Área = %.4f", area);
		
		sc.close();
	
		*/
		
		/*
		Exercício 3
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		System.out.println("Este programa calcula a diferença do produtos de quatro números. Digite A, B, C e D:");
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = A * B - C * D;
		
		System.out.println("A diferença dos produtos é: " + diferenca);
				
		sc.close();
		*/
		
		/*
		Exercício 4
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double salario, valorHora;
		
		System.out.println("Este programa calcula o salário de um funcionário. Digite o número identificador do funcionário:");
		
		numero = sc.nextInt();
		
		System.out.println("Digite o número de horas trabalhadas:");
		
		horas = sc.nextInt();
		
		System.out.println("Digite o valor recebido por hora pelo funcionário:");
		
		valorHora = sc.nextDouble();
		
		salario = horas * valorHora;
		
		System.out.printf("O salário recebido pelo funcionário número %d é de $ %.2f", numero, salario);
		
		sc.close();
		*/
		
		/*
		Exercício 5
		Scanner sc = new Scanner(System.in);
				
		int item1, item2, quant1, quant2;
		
		double preco1, preco2, total;
		
		System.out.println("Este programa calcula o valor de uma compra. Informe os códigos dos itens:");
		
		item1 = sc.nextInt();
		item2 = sc.nextInt();
		
		System.out.println("Informe a quantidade do produto " + item1 + " :");
		
		quant1 = sc.nextInt();
		
		System.out.println("Informe o valor unitário do produto " + item1 + " :");
		
		preco1 = sc.nextDouble();
		
		System.out.println("Informe a quantidade do produto " + item2 + " :");
		
		quant2 = sc.nextInt();
		
		System.out.println("Informe o valor unitário do produto " + item2 + " :");
		
		preco2 = sc.nextDouble();
		
		total = quant1 * preco1 + quant2 * preco2;
		
		System.out.printf("Valor a pagar: R$ %.2f", total);
				
		sc.close();
		*/
		
		/*
		Exercício 6
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		double pi = 3.14159;
		
		System.out.println("Digite valores para A, B e C:");
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = (A * C) / 2.0;
		
		circulo = pi * (Math.pow(C,2.0));
		
		trapezio = ((A + B) * C) / 2.0;
		
		quadrado = Math.pow(B, 2.0);
		
		retangulo = A * B;
		
		System.out.printf("a) Área do triângulo, com base A e altura C = %.3f%n", triangulo);
		
		System.out.printf("b) Área do círculo de raio C = %.3f%n", circulo);
		
		System.out.printf("c) Área do trapézio, com bases A e B e altura C = %.3f%n", trapezio);
		
		System.out.printf("d) Área do quadrado de lado B = %.3f%n", quadrado);
		
		System.out.printf("e) Área do retângulo com lados A e B = %.3f%n", retangulo);
		
		sc.close();
		*/
		
	}

}
