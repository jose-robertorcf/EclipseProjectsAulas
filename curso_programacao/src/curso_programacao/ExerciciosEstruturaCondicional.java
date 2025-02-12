package curso_programacao;

import java.util.Scanner;

public class ExerciciosEstruturaCondicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		Exercício 1
		
		int x;
		
		System.out.println("Digite um número:");
		
		x = sc.nextInt();
		
		if (x < 0) {
			System.out.println("NEGATIVO");
		}
		
		else {
			System.out.println("NÃO NEGATIVO");
		}
		
		*/
		
		/*
		Exercício 2
			
		int x;
		
		System.out.println("Digite um número:");
		
		x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("PAR");
		}
		
		else {
			System.out.println("ÍMPAR");
		}
		*/
		
		
		/*
		Exercício 3
		
		int A, B;
		
		System.out.println("Digite dois números inteiros:");
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A > B) {
			if(A % B == 0) {
				System.out.println("São múltiplos");
			}
			else {
				System.out.println("Não são múltiplos");
			}
		}
		else {
			if(B % A == 0) {
				System.out.println("São múltiplos");
			}
			else {
				System.out.println("Não são múltiplos");
			}
		}
		
		*/
		
		/*
		Exercício 4
				
		int inicio, fim, duracao;
		
		System.out.println("Vamos calcular a duração do jogo. Digite a hora de início e a hora de término:");
		
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		if(fim > inicio) {
			duracao = fim - inicio;
		}
		else {
			duracao = (24-inicio) + fim;
		}
		
		System.out.println("O jogo durou " + duracao + " hora(s)");
		
		*/
		
		/*
		Exercício 5
				
		int codigo, quant;
		double preco, total;
		
		System.out.println("Informe o código do produto e a quantidade desejada:");
		
		codigo = sc.nextInt();
		quant = sc.nextInt();
		
		if(codigo == 1) {
			preco = 4.0;
			total = preco * quant;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if(codigo == 2) {
			preco = 4.5;
			total = preco * quant;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if(codigo == 3) {
			preco = 5.0;
			total = preco * quant;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if(codigo == 4) {
			preco = 2.0;
			total = preco * quant;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if(codigo == 5) {
			preco = 1.5;
			total = preco * quant;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else {
			System.out.println("Código inválido");
		}
		
		*/
		
		/*
		Exercício 6
				
		double valor;
		
		System.out.println("Digite um valor entre 0 e 100:");
		
		valor = sc.nextDouble();
		
		if(valor >= 0 && valor <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		else if(valor > 25 && valor <= 50){
			System.out.println("Intervalo (25,50]");
		}
		else if(valor > 50 && valor <= 75){
			System.out.println("Intervalo (50,75]");
		}
		else if(valor > 75 && valor <= 100){
			System.out.println("Intervalo (75,100]");
		}
		else {
			System.out.println("Fora do intervalo");
		}
		
		*/
		
		/*
		Exercício 7
		
		double x, y;
		
		System.out.println("Digite as coordenadas para x e para y, utilizando uma casa decimal:");
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if(x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if(x == 0.0 && y != 0.0) {
			System.out.println("Eixo x");
		}
		else if(x != 0.0 && y == 0.0) {
			System.out.println("Eixo y");
		}
		else if(x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if(x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if(x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else if(x > 0.0 && y < 0.0) {
			System.out.println("Q4");
		}
		
		*/
		
		/*
		Exercício 8
				
		double salario, calculo8, calculo18, calculo28, imposto;
		
		System.out.println("Digite o salário para se calcular o imposto de renda:");
		
		salario = sc.nextDouble();
		
		if(salario <= 2000) {
			System.out.println("Isento");
		}
		else if (salario > 2000 && salario <= 3000){
			calculo8 = salario - 2000;
			imposto = calculo8 * 0.08;
			System.out.printf("R$ %.2f", imposto);
		}
		else if (salario > 3000 && salario <= 4500){
			calculo18 = salario - 3000;
			calculo8 = salario - 2000 - calculo18;
			imposto = calculo18 * 0.18 + calculo8 * 0.08;
			System.out.printf("R$ %.2f", imposto);
		}
		
		else {
			calculo28 = salario - 4500;
			calculo18 = salario - 3000 - calculo28;
			calculo8 = salario - 2000 - calculo18 - calculo28;
			imposto = calculo28* 0.28 + calculo18 * 0.18 + calculo8 * 0.08;
			System.out.printf("R$ %.2f", imposto);
		}
		
		*/
		
		
		
		
		
		sc.close();

	}

}
