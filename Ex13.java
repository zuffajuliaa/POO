//13. Entrar via teclado com três valores distintos. Exibir o maior deles.

package Ex;

import java.util.Scanner;
public class Ex13 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
    
int a, b,c;
    System.out.printf("valor 1: ");
    a=ler.nextInt();
    
    System.out.printf("valor 2: ");
    b=ler.nextInt();
    
    System.out.printf("valor 3: ");
    c=ler.nextInt();



if(a>b&&a>c)
	
{



   System.out.printf("%d", a);
    
    }
else if (b>a&&b>c)
{
    System.out.printf("%d",b);
}
else {
    System.out.printf("%d",c);
}
}
}