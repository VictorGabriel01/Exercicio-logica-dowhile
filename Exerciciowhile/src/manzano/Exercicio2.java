package manzano;

public class Exercicio2 {

	public static void main(String[] args) {
		int contadora = 1;
		int acumuladora = 0;
		do {
		    if (contadora % 2 == 0) {
		       acumuladora=acumuladora+contadora; 
		    }
		    contadora++;

		   
		}  while (contadora<501); 
		System.out.println("o valor total é "+acumuladora);
	}

}
