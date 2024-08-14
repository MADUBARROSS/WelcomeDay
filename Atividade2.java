package atividades;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int dia;
	
	System.out.println("Informar o dia da semana de 1 a 7: ");
	dia = ler.nextInt();
	
		switch (dia) {
	case 1:
		System.out.println("o dia escolhido foi Domingo");
		break;
	case 2:
		System.out.println("O dia escolhido foi Segunda");
		break;
	case 3:
		System.out.println("O dia escolhido foi Terça");
		break;
	case 4:
		System.out.println("o dia escolhido foi Quarta");
		break;
	case 5:
		System.out.println("o dia escolhido foi Quinta");
		break;
	case 6:
		System.out.println("O dia escolhido foi Sexta");
		break;
	case 7:
		System.out.println("O dia escolhido foi sábado");
		break;
	default:
		}
System.out.println("Informe um dia válido");
ler.close ();

	}

}
