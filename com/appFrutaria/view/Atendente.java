package com.appFrutaria.view;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.appFrutaria.model.Fruta;

public class Atendente {
	
	Scanner input;
	
	public Atendente() { input = new Scanner(System.in); }

	public Scanner getInput() { return input; }

	public void setInput(Scanner input) { this.input = input;}
	
	public int menuPrincipal() {
		
		System.out.println("|-------------------------------------------------------------------|");
		System.out.println("|                    Bem vindo a Frutaria 2.0!!!                    |");
		System.out.println("|-------------------------------------------------------------------|");

		System.out.println("| 1- Cadastrar Produtos\n| 2- Listar Produtos\n| 3- Remover Produtos\n| 0 - Sair");
		System.out.println("|-------------------------------------------------------------------|");

		System.out.print("Sua Escolha: ");
		int escolha = input.nextInt();
		
		System.out.println();
		
		return escolha;
		
	}
	
	public Fruta escolhaCadastrar(Fruta fruta) {
		
		System.out.print("Insira o nome da Fruta\nDigite aqui: ");
		String nome = input.next();
		
		System.out.print("\nInsira o Preço da Fruta\nDigite aqui: ");
		double preco = input.nextDouble();
		
		System.out.print("\nInsira a Quantidade disponível\nDigite aqui: ");
		int quantidade = input.nextInt();
		
		fruta = new Fruta (nome, preco, quantidade);
		
		return fruta;
	}
	
	public void escolhaExcluir() {
		
		System.out.println("|-------------------------------------------------------------------|");
		System.out.println("|                    Qual Fruta deseja Remover?                     |");
		System.out.println("|-------------------------------------------------------------------|");
	
	}
	
	public int escolherFrutaExcluir() {
		
		System.out.print("Insira aqui: ");
		int escolha = input.nextInt();
		return escolha;
	}
	
	public void atualizarEstoque () {
		
		System.out.println("|-------------------------------------------------------------------|");
		System.out.println("|                Estoque Atualizado com Sucesso!!!                  |");
		System.out.println("|-------------------------------------------------------------------|");
	}

}


