package manzano;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int contadora = 1;
		System.out.println("Digite um n�mero");
		int numero1 = sc.nextInt();
		System.out.println("Digite outro n�mero");
		int numero2 = sc.nextInt();
		var numero3 = 1;
		do {
		    numero3 = numero3+numero2;
		    contadora++;
		} while (numero3 == numero1);

		System.out.println(numero1+" / "+numero2+ " = "+ contadora);
	}

}
