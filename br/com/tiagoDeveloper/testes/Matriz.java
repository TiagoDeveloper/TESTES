package br.com.atoa.teste;

import java.util.Scanner;

public class Matriz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		teste3();

	}//fim do método main
	
	public static void teste1(){
		
		int linha = 10;
		int coluna = 55;
		
		Scanner entrada = new Scanner(System.in);
		
		char nome[][] = new char[linha][coluna];

		System.out.println("Digite o nome: ");
	
		nome [0] = entrada.nextLine().toCharArray();

		int i = nome [0].length;
		
		for(int x = 0; x < i;x++){

			System.out.print(nome[0][x]+"");
			
		}
		
	}//fim do teste1
	
	
	public static void teste2(){
		
		int linha = 10;
		int coluna = 0;
		String palavra;
		
		Scanner entrada = new Scanner(System.in);
		
		char nome[][] = new char[linha][coluna];

		System.out.println("Digite o nome: ");
	
		palavra = entrada.nextLine();

		coluna = palavra.length();
		
		nome[0] = palavra.toCharArray();
		
		for(int x = 0; x < coluna;x++){

			System.out.print(nome[0][x]+"");
			
		}

		
	}//fim do teste1
	
	public static void teste3(){
		
		int limite = 1;
		Scanner opcao = new Scanner(System.in);
	
		
		
		for(int i = 0;i < limite;i++){
			
			
			System.out.println("Deseja sair:");
			
			
			
			if(opcao.nextLine().equals("nao")){
				
				System.out.println("teste"+i);
				limite++;
			}else{
				
				System.out.println("Obrigado!!!");
				
			}
			
			
		}
		
		
		
		
		
	}//fim teste3

}//fim da classe matriz
