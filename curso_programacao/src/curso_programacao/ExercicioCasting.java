package curso_programacao;

public class ExercicioCasting {

	public static void main(String[] args) {
		
		int a,b;
		double resultado;
		
		a=5;
		b=2;
		
		resultado = a/b; // como são duas variáveis inteiras, o java espera que o resultado também será inteiro
		
		System.out.println(resultado);
		
		resultado = (double)a/b; // colocar (double), ou seja, casting, mostra para o java que você quer o resultado em double
		System.out.println(resultado);

		
		double c;
		int d;
		
		c=5.0;
		d= (int)c; // usar o casting desta forma, indica ao java que você não se importa em perder as casas decimais e ele faz a conversão
		
		System.out.println(d);
		
		
	}

}
