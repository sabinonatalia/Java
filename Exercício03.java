package br.com.generation.lista03;

import java.util.Scanner;

public class Exerc�cio03 {

	public static void main(String[] args) {
// 3 - Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
// Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99 
		
	   Scanner ler = new Scanner(System.in);

		int idade = 0, menorDe21 = 0, maiorDe50 = 0;
		
		while(idade != -99) {
			
			System.out.print("Digite sua idade: ");
			idade = ler.nextInt();
			
			if( idade<21) {
				menorDe21++;
			}
			else if(idade > 50) {
				maiorDe50++;
			}
			}
			ler.close();
			System.out.printf("O total de pessoas menores de 21 anos �: ", menorDe21);
			System.out.printf("O total de pessoas maiores de 50 anos �: ", maiorDe50);   
			System.out.printf("Fim do programa");
	    	}
			}

