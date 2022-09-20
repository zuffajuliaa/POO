package Ex;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
	

		Scanner ler = new Scanner(System.in);
		
		float num1, num2;
		
		char calc;
		
		System.out.print("Escolha sua operação: ");
        calc = ler.nextLine().charAt(0);
		
		System.out.println("Insira o primeiro valor: ");
		num1 = ler.nextFloat();
		
		System.out.println("Insira o segundo valor: ");
		num2 = ler.nextFloat();
		
		switch (calc) {
		
			case '1':
				
				System.out.printf("%.2f * %.2f = %.2f", num1, num2, num1 * num2);
                break;
			
			case '2' :
				
				System.out.printf("%.2f + %.2f = %.2f", num1, num2, num1 + num2);
                break;
				
			case '3' :
				
				System.out.printf("%.2f / %.2f = %.2f", num1, num2, num1 / num2);
                break;
				
			case '4' :
				
				System.out.printf("%.2f - %.2f = %.2f", num1, num2, num1 - num2);
                break;
				
			default:
				System.out.println("5 - Fim de Processo");
		}
		
	}

}
