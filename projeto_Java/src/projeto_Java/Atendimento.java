package projeto_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atendimento {

	public static void main(String[] args) {
		List<String> informacoes = new ArrayList<String>();
		
		Scanner teclado = new Scanner(System.in);
		
		String nome, telefone, idade, opcoes;
		
		///////////////////////////////////////////
		
		System.out.println("1 para ler clientes");
		System.out.println("2 para listar clientes");
		System.out.println("3 para finalizar");
		opcoes = teclado.next();
		
		if(opcoes.equals("1")) {
			
			System.out.println("digite o nome");
			nome = teclado.next();
			informacoes.add(nome);
			
			System.out.println("digite a idade");
			idade = teclado.next();
			informacoes.add(idade);
			
			System.out.println("digite o telefone");
			telefone = teclado.next();
			informacoes.add(telefone);
			
		} else if(opcoes.equals("2")) {
			
			System.out.println(informacoes);
			
		} else {
			System.out.println("finalizado");
		}
		
		
	}

}
