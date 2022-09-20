//11. Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão digitados. Se a área for maior que 100, exibir a mensagem “Terreno grande”.

package Ex;

import java.util.Scanner;
public class Ex11 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
    
int a, b, area;
    System.out.printf("base: ");
    a=ler.nextInt();
    
    System.out.printf("altura: ");
    b=ler.nextInt();
    
area=a*b;
System.out.printf("area: %d", area);



if(area>=100)
{



   System.out.println("O terreno é grande");
    
    }
}
}