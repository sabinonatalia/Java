package br.com.generation.lista03;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		
		/* 5- Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		  No final, mostre a soma dos números digitados */
		
		Scanner ler = new Scanner(System.in);
		
		int num, soma = 0; 
		
		do {
			System.out.println("Insira os números: ");
			num = ler.nextInt();
			
			soma = soma + num;
			
		} while(num !=0);
		
		System.out.println("A soma de todos os números digitados é: " + soma);
		
		ler.close();
		}
		}
