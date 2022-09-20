//9. Entrar via teclado, com dois valores distintos. Exibir o menor deles.
package Ex;
import java.util.Scanner;
public class Ex9 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
    
int a, b;
    System.out.printf("Digite o primeiro valor: ");
    a=ler.nextInt();
    
    System.out.printf("Digite o segundo valor: ");
    b=ler.nextInt();
    
    if(a>b)
    {
        System.out.printf("%d",a);
    }
        
        else
            System.out.printf("%d",b);
        }
    
}