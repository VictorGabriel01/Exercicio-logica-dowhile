package manzano;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

int soma = 1;


String opcao;
do {
	System.out.println("Digite o nome do c�modo que deseja calcular a area: ");
String nome = sc.nextLine();
System.out.println("Digite o valor da largura do c�modo :");
float largura = sc.nextFloat();
System.out.println("Digite o valor do comprimento do c�modo : ");
float comprimento = sc.nextFloat();
int area = (int) (comprimento*largura);
System.out.println("Deseja calcular novo c�modo?");
opcao = sc.nextLine();
System.out.println("A area do(a) "+ nome+" � "+ area);
 soma = soma + area;
} while (opcao == "nao");
System.out.println("A somatoria das area calculadas �"+ soma);
	}

}
