package Ex;
import java.util.Scanner;
public class Ex23 {
 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

            int a, b, c, d;
            System.out.printf("Digite o valor a: ");
            a=ler.nextInt();
            System.out.printf("Digite o valor b: ");
            b=ler.nextInt();
            System.out.printf("Digite o valor c: ");
            c=ler.nextInt();
            d=a+b;
            if(d<c)
            {
            System.out.printf("A soma é menor que o valor c");
            }
 
 
    }
}