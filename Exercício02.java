package br.com.generation.lista03;

import java.util.Scanner;

public class Exerc�cio02 {

	public static void main(String[] args) {
	// 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares
		
		Scanner ler = new Scanner(System.in);
		
		int cont, par = 0, impar= 0, num;
		
		for(cont=0; cont<10; cont++) {
			
			System.out.println("Digite um n�mero qualquer: ");
			num = ler.nextInt();
			
		if(num%2==0) {
			par++;
	    }
		
		else {
			impar++;
		}

		System.out.println("A quantidade de n�meros pares �: " + par);
		System.out.println("A quantidade de n�meros impares �: " + impar);
		
		ler.close();
		}
		}
		}