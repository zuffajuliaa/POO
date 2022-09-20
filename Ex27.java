package Ex;
import java.util.Scanner;
public class Ex27 {
 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

            int a,b;
            System.out.printf("Digite um numero: ");
            a=ler.nextInt();
           if(a%2==0)
           {
               b=a+5;
               System.out.printf("O numero +5 é: %d", b);
           }
           else
           {
               b=a+8;
               System.out.printf("O número +8 é: %d", b);
           }
 
    }
}