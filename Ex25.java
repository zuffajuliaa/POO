package Ex;
import java.util.Scanner;
public class Ex25{
 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

            int a;
            System.out.printf("Digite o valor a: ");
            a=ler.nextInt();
          
            if(a%2==0)
            {
            System.out.printf("O número é par");
            }
            else {
            	System.out.printf("O número é ímpar");
            }
 
    }
}