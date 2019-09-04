import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class LexicoMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Cria lista de tokens
		ArrayList<Token> lt = new ArrayList<Token>();
		
		//Cria analisador léxico
		Lexico lexico = new Lexico();
		
		//Realliza a análise léxica
		//lexico.analisa(args[0]);
		lt = lexico.analisa("teste1.lpd");
		
		//Imprime número de tokens
		System.out.println("Número de tokens: " +lt.size());
	
		//Percorre lista de tokens imprimindo-os
		lt.forEach(token -> System.out.println(token.toString()));
		
	}

}
