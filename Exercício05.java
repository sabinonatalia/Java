package br.com.generation.lista03;

import java.util.Scanner;

public class Exerc�cio05 {

	public static void main(String[] args) {
		
		/* 5- Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
		  No final, mostre a soma dos n�meros digitados */
		
		Scanner ler = new Scanner(System.in);
		
		int num, soma = 0; 
		
		do {
			System.out.println("Insira os n�meros: ");
			num = ler.nextInt();
			
			soma = soma + num;
			
		} while(num !=0);
		
		System.out.println("A soma de todos os n�meros digitados �: " + soma);
		
		ler.close();
		}
		}
