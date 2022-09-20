//1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
package Ex;
import java.util.Scanner;
public class Ex1 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
    
    int a, b, mult;
    System.out.printf("Digite a base: ");
    a=ler.nextInt();
    System.out.printf("Digite a altura: ");
    b=ler.nextInt();
    mult=a*b;
    System.out.printf("A area e: %d ", mult);
    }



}