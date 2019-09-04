import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Lexico {

	//Stream de leitura do arquivo-fonte
	PushbackReader r;
	
	//Lista de tokens
	ArrayList<Token> lt = new ArrayList<Token>();
	
	//Armazena código do caracter lido
	int intch;
	
	//Armazena caracter lido
	char ch; 
	
	//Linha de ch 
	int linha = 1;
	
	//Coluna de ch
	int coluna = 1;
	
	public ArrayList<Token> analisa(String arquivo) throws IOException {
		
		//PushbackReader será usado para devolver caracter ao stream
		r = new PushbackReader (
				new BufferedReader(
					new InputStreamReader(
						new FileInputStream(arquivo), "US-ASCII")));
		
		while ( (intch = r.read()) != -1 ) {
			//System.out.println(intch);
			ch = (char) intch;
			System.out.println(ch);
			
			if (Character.isLetter(ch))
				System.out.println("É letra");

			if (Character.isDigit(ch))
				System.out.println("É dígito");
			
			if (ch == '\n') {
				linha++;
				coluna = 1;
			}
		}
		
		
		return lt;
		
	}
	
}
