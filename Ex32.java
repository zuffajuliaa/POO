package POO;

import java.util.Scanner;
import java.io.IOException;
public class Ex32 {

	    public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
	
		int a, b;
		
		System.out.print("Digite um número qualquer: ");
		a = ler.nextInt();
		System.out.print("Digite um número maior que o anterior: ");
		b = ler.nextInt();
		
		while(b<a)
		{
			System.out.print("Digite um número maior que o primeiro: ");
			b = ler.nextInt();
			break;
		}
		System.out.printf("Os números digitados foram %d e %d",a,b);
		
	}
}