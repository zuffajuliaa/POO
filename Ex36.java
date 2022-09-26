package POO;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int x, a, b;
			
			do {
				System.out.printf("Digite um numero positivo: ");
				x = ler.nextInt();
			}
			while(x <= 0);
			
			System.out.printf("Digite o primeiro valor: ");
			a = ler.nextInt();
			
			do {
				System.out.printf("Digite um segundo valor maior que o primeiro : ");
				b = ler.nextInt();
			}
			while(b <= a);
			
			for(; b >= a; b--) {
				System.out.printf("\n%d X %d = %d", b, x, (b*x));
			}
		}

	}

}