//12. Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão digitados. Se a área for maior que 100, exibir a mensagem “Terreno grande”, caso contrário, exibir a mensagem “Terreno pequeno”.


package Ex;

import java.util.Scanner;
public class Ex12 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
    
int a, b, area;
    System.out.printf("base: ");
    a=ler.nextInt();
    
    System.out.printf("altura: ");
    b=ler.nextInt();
    
area=a*b;
System.out.printf("area: %d \n5", area);



if(area>=100)
{



   System.out.println("O terreno é grande");
    
    }
else {
    System.out.println("Terreno pequeno");
}
}
}