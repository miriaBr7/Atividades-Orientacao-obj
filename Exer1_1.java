package exercicio;

import java.util.Scanner;

public class Exer1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//ler o numero
		System.out.println("informe um numero:");
		String aux = sc.nextLine();
		int num = Integer.parseInt(aux);
		
		int resultado;
		//verificar se positivo ou negativo
		
		if(num> 0)
		resultado = num *2;
		
		
		else
			resultado = num *3;
		
		System.out.println(resultado);

	}

}
