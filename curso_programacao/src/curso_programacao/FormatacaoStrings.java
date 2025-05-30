package curso_programacao;

public class FormatacaoStrings {

	public static void main(String[] args) {
		
		/*
		Formatar: toLowerCase(), toUpperCase(), trim() [trim remove espaços]
		Recortar: substring(inicio), substring(inicio, fim)
		Substituir: Replace(char, char), Replace(string, string)
		Buscar: IndexOf, LastIndexOf
		str.Split(" ")
		*/
	
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc"); //retorna a posição da primeira aparição de "bc"
		int j = original.lastIndexOf("bc"); //retorna a posição da última aparição de "bc"
		
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" "); //separa a string de acordo com os " "(espaços)
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
				
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2,9): -" + s05 + "-");
		System.out.println("replace('a','x'): -" + s06 + "-");
		System.out.println("replace('abc','xy'): -" + s07 + "-");
		System.out.println("IndexOf('bc'): -" + i + "-");
		System.out.println("LastIndexOf('bc'): -" + j + "-");
	
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
	
	}

}
