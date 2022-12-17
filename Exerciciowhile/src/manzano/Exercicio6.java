package manzano;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um número positivo:");
		int numero = sc.nextInt();
		if (numero <= 0) {
		    do {
		    	System.out.println("Digite um número positivo:");
				numero = sc.nextInt();
		    } while (numero <= 0);
		}

	}

}
