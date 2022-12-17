package manzano;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 1;
		int contador1 = 0;
		int soma = 1;
		do {
		     System.out.println("Digite um número:");
		     int numero = sc.nextInt();
		    contador1++;
		    int fatorial = 1;
		    for ( contador1= 0; contador1 < numero; contador1++) {
				 fatorial = fatorial * contador1;
			}
		      soma = soma+fatorial;
		} while (contador1 == 15);
		System.out.println(soma);
	}

}
