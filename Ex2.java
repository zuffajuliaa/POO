//2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
package Ex;
import java.util.Scanner;
public class Ex2 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
    
    int a, b, mult;
    System.out.printf("Digite a aresta: ");
    a=ler.nextInt();
    mult=a*a;
    System.out.printf("A area é : %d", mult);
    }
}