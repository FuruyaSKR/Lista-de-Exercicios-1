import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print(" Quanto � o raio do circulo? ");
		float raio = entrada.nextFloat();
		
		float area = (float) (Math.PI*(raio*raio)); 
		
		System.out.print("A area desse circulo � de:" +area);

		entrada.close();
	}

}
