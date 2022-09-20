//5. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.
package Ex;
import java.util.Scanner;
public class Ex5 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
    
float a, mult;
    System.out.printf("Digite a temperatura em ºC: ");
    a=ler.nextInt();
    mult=(a*(9/5))+32;        
    System.out.printf("A média e : %.2f", mult);
    }



}