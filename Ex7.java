//7. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido.

package Ex;
import java.util.Scanner;
public class Ex7 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
    
double a, b, c, d, e, entrada, mult;
    System.out.printf("Digite o primeiro valor: ");
    a=ler.nextDouble();
    System.out.printf("Digite o segundo valor: ");
    b=ler.nextDouble();
    System.out.printf("Digite o terceiro valor: ");
    c=ler.nextDouble();
    System.out.printf("Digite o quarto valor: ");
    d=ler.nextDouble();
    System.out.printf("Digite o quarto valor: ");
    e=ler.nextDouble();
    mult= a+b+c+d+e;
    System.out.printf("Digite o pagamento: ");
    entrada=ler.nextDouble();
    mult=entrada-mult;    
    System.out.printf("Valor do troco e: R$ %.2f", mult);
    }



}