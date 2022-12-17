package manzano;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

int soma = 1;


String opcao;
do {
	System.out.println("Digite o nome do cômodo que deseja calcular a area: ");
String nome = sc.nextLine();
System.out.println("Digite o valor da largura do cômodo :");
float largura = sc.nextFloat();
System.out.println("Digite o valor do comprimento do cômodo : ");
float comprimento = sc.nextFloat();
int area = (int) (comprimento*largura);
System.out.println("Deseja calcular novo cômodo?");
opcao = sc.nextLine();
System.out.println("A area do(a) "+ nome+" é "+ area);
 soma = soma + area;
} while (opcao == "nao");
System.out.println("A somatoria das area calculadas é"+ soma);
	}

}
