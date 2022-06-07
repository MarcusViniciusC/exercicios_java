package mais;

import java.util.Scanner;

public class Carteira {

	public static void main(String[] args) {
		double totalConta = 0, dinheiro=0;
		
		String escolha;
		
		Scanner teclado = new Scanner(System.in);
		//////////////////////////////////////////////////
		do {
			System.out.println("você deseja depositar ou sacar?");
			
			escolha = teclado.next();
				
				if(escolha.equals("depositar")) {
					
					System.out.println("digite o valor que deseja depositar");
					dinheiro = teclado.nextInt();
					
					System.out.println(dinheiro + totalConta);
					totalConta = totalConta + dinheiro;
					System.out.println("Seu saldo é " + totalConta);
					
				}else if(escolha.equals("sacar")) {
					
					System.out.println("digite o valor que deseja sacar");
					dinheiro = teclado.nextInt();
					
					if(dinheiro<totalConta) {
						
					System.out.println(dinheiro - totalConta);
					totalConta = totalConta - dinheiro;
					System.out.println(totalConta);
					
				}else{System.out.println("seu saldo é insuficiente");} }else if(escolha.equals("ver")) {
					System.out.println("Seu salo total é: " + totalConta);
				}
					
				
				
			
		} while(escolha.equals("sacar")||escolha.equals("depositar")||escolha.equals("ver"));
	}

}
