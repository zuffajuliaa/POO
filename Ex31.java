package POO;

import java.util.Scanner;
import java.io.IOException;
public class Ex31 {

	    public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
	
		int a;
		
		System.out.print("Digite um número positivo: ");
		a = ler.nextInt();
		while(a<0)
		{
			System.out.print("Digite um número positivo: ");
			a = ler.nextInt();
		}

	}
}