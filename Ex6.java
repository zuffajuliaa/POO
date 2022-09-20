//6. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).
package Ex;
import java.util.Scanner;
public class Ex6 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
    
double a, b, mult;
    System.out.printf("Digite a cotação: ");
    a=ler.nextDouble();
    System.out.printf("Digite a quantidade de dolares: ");
    b=ler.nextDouble();
    mult= a*b;    
    System.out.printf("Valor: R$ %.2f", mult);
    }



}