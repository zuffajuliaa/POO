package Ex;
import java.util.Scanner;
import java.io.IOException;
public class Ex24 {
	
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
		String n, e;
		char s;
		int a;
		
		System.out.print("Digite o seu nome: ");
		n = ler.next();
		System.out.print("Digite o seu sexo(F/M):");
	    s = (char)System.in.read();
		System.out.print("Digite o seu estado civil(CASADA(O)/SOLTEIRA(O): ");
		e = ler.next();
		if(s == 'F')
		{
			if( e.equals("CASADA") )
			{
				System.out.printf("Digite o tempo de casada em anos: ");
				a = ler.nextInt();
			}
		}

	}
}

