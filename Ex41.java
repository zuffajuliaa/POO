package POO;
import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);


		int a, b;
		int c = 2;
		int d = 3;
		
		do {
			System.out.print("Digite a quantidade de números da série: ");
			a = ler.nextInt();
			if(a>100)
				System.out.print("Valor inválido\nTente Novamente!!\n");
		} while (a>100);
		for(b=1;b<=a;b++)
		{
			System.out.println(c);
			c = c + d;
			d = d + 2;
		}
		ler.close();
	}
}