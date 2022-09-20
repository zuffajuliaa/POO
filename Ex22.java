package Ex;

public class Ex22 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		 
	       int resultado = somar(num1, num2);
	 
	       if(resultado == 30) {
	           System.out.println("Resultado dentro do esperado!");
	       } else {
	           System.out.println("Resultado fora do esperado!");
	       }
	   }
	 
	   private static int somar(int num1, int num2) {
	       return num1 + num2;
	   }

}
