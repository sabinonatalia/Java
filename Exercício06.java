package br.com.generation.lista03;

import java.util.Scanner;

public class Exerc�cio06 {

	public static void main(String[] args) {
	
		/*6-Escrever um programa que receba v�rios n�meros inteiros no teclado. 
		 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).
		 */

		Scanner ler = new Scanner(System.in);
		
		int num, media, soma = 0, x = 0;
		
		do {
			System.out.println("Insira um n�mero: ");
			num = ler.nextInt();
			
		if(num%3==0) {
			soma = soma + num;
			x++;	
		}
		}
		while(num != 0);
		   media = soma / x;
		   
		   System.out.println("A m�dia dos n�meros inseridos �: " + media);
			
		   ler.close();
		}
		}


