package POO;

import java.util.Scanner;
import java.io.IOException;
public class Ex33 {

	    public static void main(String[] args) throws IOException {
		try (Scanner ler = new Scanner(System.in)) {
		}
	char a;
		do 
		{
			System.out.print("Digite o seu sexo (F) para feminino e (M) para masculino: ");
		    a = (char)System.in.read();
		    System.out.print(a);
		    if(a == 'F')
		    	break;
		    else if(a == 'M')
		    	break;
		    else
		    	System.out.print("Gênero inválido!!");
		} while (a != 'F' || a != 'M');
	}
}
		
	