//4. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.

package Ex;
import java.util.Scanner;
public class Ex4 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
    
    int a, b, c, d, mult;
    System.out.printf("Digite o valor 1: ");
    a=ler.nextInt();
    System.out.printf("Digite o valor 2: ");
    b=ler.nextInt();
    System.out.printf("Digite o valor 3: ");
    c=ler.nextInt();
    System.out.printf("Digite o valor 4: ");
    d=ler.nextInt();
    mult=(a+b+c+d)/4;
    System.out.printf("A média e : %d", mult);
    }



}