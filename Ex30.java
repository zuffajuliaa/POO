package Ex;
import java.util.Scanner;

public class Ex30 {
	
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		
		double a, d, t, p;
		int op;
		
		System.out.print("Digite o preço de etiqueta do produto: ");
		a = ler.nextDouble();
		do 
		{
			System.out.print("1-À vista em dinheiro ou cheque \n2-À vista no cartão de crédito \n3-Em duas vezes(sem juros) \n4-Em quatro vezes(com juros)");
			System.out.print("\nSelecione sua forma de pagamento: ");
			op = ler.nextInt();
			if(op == 1)
			{
				d = a * 0.1;
				t = a - d;
				System.out.printf("O valor a ser pago em dinheiro é de: %.2f",t);
			}
			else
				if(op == 2)
				{
					d = a * 0.15;
					t = a - d;
					System.out.printf("O valor a ser pago no cartão de crédito é de: %.2f", t);
				}
				else
					if(op == 3)
					{
						p = a/2;
						System.out.printf("O valor de cada parcela é: %.2f\nE o valor total é: %.2f", p, a);
					}
					else
						if(op == 4)
						{
							d = a * 0.1;
							t = a + d;
							p = t/4;
							System.out.printf("O valor de cada parcela é: %.2f\nE o valor total é: %.2f", p, t);
						}
						else
							System.out.print("Opção inválida!!\nTente Novamente!!\n");

		}while(op < 1 || op > 4);
	}
}