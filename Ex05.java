import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Convers�o Metros para Cent�metros ");
		System.out.print(" Quantos metros?  ");
        int metros = entrada.nextInt();
        
        	System.out.println(" " +metros+ "m s�o exatamente " +metros*100 +"cm.");
		
        	entrada.close();
        	
	}

}
