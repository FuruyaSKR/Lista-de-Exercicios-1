
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Informe um n�mero: ");
		int num1 = entrada.nextInt();

	System.out.print("Informe um n�mero: ");
		int num2 = entrada.nextInt();
	
		System.out.println("A Soma dos n�meros informados �: "+(num1+num2));
	
		entrada.close();
	}

}