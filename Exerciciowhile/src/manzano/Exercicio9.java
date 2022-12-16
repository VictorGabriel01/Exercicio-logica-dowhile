package manzano;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		do {
			System.out.println("Digite um valor positivo inteiro (valor negativo para encerrar):");
			valor = sc.nextInt();
		    if (valor > 1) {
		        var maior = valor;
		        System.out.println(maior);
		    }
		} while (valor <= 0);
	}

}
