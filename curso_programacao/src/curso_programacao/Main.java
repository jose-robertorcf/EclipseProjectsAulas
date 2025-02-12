package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y =32;
		double x =10.35784;
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.print("Olá Mundo!"); //sem quebra de linha
		System.out.println("Bom dia!"); //com quebra de linha
		
		
		System.out.println(y);
		System.out.println(x);
		
		System.out.printf("%.2f%n",x); //printf serve para imprimir formatado/ %.2f-> duas casas decimais e %n (ou\n) é quebra de linha
		System.out.printf("%.4f%n",x); //imprimi com vírgula pois o printf pega o formato padrão do PC
		
		Locale.setDefault(Locale.US); //definindo o local como EUA, e vai imprimir com ponto
		System.out.printf("%.4f\n",x);
		
		System.out.println("Resultado = "+x+" metros"); //concatenando
		System.out.printf("Resultado = %.2f metros%n",x); //concatenando com formatação
		
		
		
		//marcadores: %f flutuante/ %d inteiro/ %s texto/ %n quebra de linha
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
