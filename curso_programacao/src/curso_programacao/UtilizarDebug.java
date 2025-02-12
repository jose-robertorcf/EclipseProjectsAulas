package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class UtilizarDebug { //clicar com botão direito na classe e selecionar "debug as -> java application"

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble(); //para inserir um breakpoint ctrl+shift+b
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();
	}
}