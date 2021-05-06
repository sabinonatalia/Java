package br.com.generation.lista03;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
	// 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares
		
		Scanner ler = new Scanner(System.in);
		
		int cont, par = 0, impar= 0, num;
		
		for(cont=0; cont<10; cont++) {
			
			System.out.println("Digite um número qualquer: ");
			num = ler.nextInt();
			
		if(num%2==0) {
			par++;
	    }
		
		else {
			impar++;
		}

		System.out.println("A quantidade de números pares é: " + par);
		System.out.println("A quantidade de números impares é: " + impar);
		
		ler.close();
		}
		}
		}