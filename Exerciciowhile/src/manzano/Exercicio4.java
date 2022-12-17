package manzano;

public class Exercicio4 {

	public static void main(String[] args) {
		int quadrado = 1;
		int soma = quadrado;
		int grao = 2;
		int contador = 1;
		System.out.println("1");
		do {
			System.out.println(grao);
		    contador++;
		     grao = grao * 2;
		    quadrado++;
		     soma = soma + grao;
		} while (contador == 64);
		System.out.println(soma);
	}

}
