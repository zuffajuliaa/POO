// 3-A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
package Ex;
import java.util.Scanner;
public class Ex3 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
    
    int a, b, mult;
    System.out.printf("Digite a base: ");
    a=ler.nextInt();
    System.out.printf("Digite a altura: ");
    b=ler.nextInt();
    mult=(a*b)/2;
    System.out.printf("A area : %d", mult);
    }
}