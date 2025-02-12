package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class LeituraDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //necessário para poder digitar o double com "."
		
		Scanner sc = new Scanner(System.in); //sc é a variável que vai receber a entrada de dados no console
		
		String x;
		int y;
		double z;
		char a;
		
		x = sc.next();
		
		System.out.println("Você digitou: " + x); // escrever sysout e apertar ctrl+espaço o eclipse já completa o comando
		
		 
		y = sc.nextInt();
		
		System.out.println("Você digitou: " + y);
		
		
		z = sc.nextDouble();
		
		System.out.println("Você digitou: " + z); //println sempre vai mostrar com "." por ser global. Para sair com virgula, tem que colocar printf
		
		
		a = sc.next().charAt(0); //charAt(*) pegar o caractere na posição (*)
		
		System.out.println("Você digitou: " + a);
		
		
		//os dados podem ser coletados de uma vez também
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close(); //para fechar a variável sc quando não precisar mais

	}

}
