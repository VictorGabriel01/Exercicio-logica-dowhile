package manzano;

public class Exercicio7 {

	public static void main(String[] args) {
		int numero = 1;
		int fatorial = 1;
		
		do {
		    fatorial = fatorial*numero;
		    if (numero % 2 == 1) {
		    	System.out.println(numero+" : "+fatorial);
		    }
		    numero++;
		} while (numero > 10);
	}

}
