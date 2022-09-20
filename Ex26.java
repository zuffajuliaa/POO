package Ex;
import java.util.Scanner;
public class Ex26 {
 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

            int a,b;
            System.out.printf("Digite um numero: ");
            a=ler.nextInt();
           if(a>=0)
           {
               b=a*2;
               System.out.printf("O dobro do número é: %d", b);
           }
           else
           {
               b=a*3;
               System.out.printf("O triplo do número é: %d", b);
           }
 
    }
}