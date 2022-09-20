package Ex;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		//não consigo fazer, ver depois
		
		Scanner ler = new Scanner(System.in);

		float p1, p2, media;
		
		System.out.println("Insira a nota da P1: ");
		p1 = ler.nextFloat();
		
		System.out.println("Insira a nota da P2: ");
		p2 = ler.nextFloat();
		
		media = (float) ((p1 + (2*p2))/3);

		3*media = P1 + 2*P2;
		(-P1 + 3*media) = 2*P2;
		(-P1 + 3*media)/2 = P2;

		P2 = (3*media - P1)/2;
		
		if (media >= 5) {
			
			System.out.println("Aprovado!");
			
		} else {
			
			System.out.println("Reprovado!");
			
		}
	}

}
