package exercicio;

import java.util.Scanner;

public class Exer2_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		int num3;
 
		Scanner leitor = new Scanner(System.in);
		System.out.println("informe o primeiro numero:");
		String ValorLido1 = leitor.nextLine();
		num1 = Integer.parseInt(ValorLido1);
				
		System.out.println("informe o segundo numero:");
		String ValorLido2 = leitor.nextLine();
		num2 = Integer.parseInt(ValorLido2);

		System.out.println("informe o terceiro numero:");
		String ValorLido3 = leitor.nextLine();
		num3 = Integer.parseInt(ValorLido3);
				
		if(num1<num2 && num1<num3) {
		System.out.println("imprime o" + num1);
		}
		 
		if(num2<3 && num2<num1) {
		System.out.println("imprime o" + num2);
		}
		
		
		if(num3<1 && num3<num2){
		System.out.println("imprime o " + num3);
		}
						
	}

}
