package curso_programacao;

import java.util.Scanner;

public class LeituraDados2 {

	public static void main(String[] args) {

		// ctrl+shift+f faz a auto-indentação do código

		Scanner sc = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		x = sc.nextInt();
		sc.nextLine(); //necessário para consumir a quebra de linha da coleta do nextInt
		s1 = sc.nextLine(); //lê o texto até a quebra de linha, ou seja, até que "Enter" seja pressionado
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
