package POO;

import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		float a = 0, y = 1;
		
		do {
		System.out.printf("Informe o tamanho da sequencia (1 >= n < 50): ");
		n = ler.nextInt();
		}
		while(n < 1 || n > 49);
		
		for(int x = 0; x < n; x++) {
			a += y/(y+1);
			y++;
		}
		
		System.out.printf("A soma dos primerios %d numeros da sequencia e: %.2f", n, a);

	}

}