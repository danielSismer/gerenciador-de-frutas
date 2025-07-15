package com.appFrutaria.view;

import java.util.Scanner;
import com.appFrutaria.model.Fruta;
import com.appFrutaria.model.Produto;
import com.appFrutaria.model.Verdura;

public class Atendente {

	private Scanner input;

	public Atendente() {
		input = new Scanner(System.in);
	}

	public int menuPrincipal() {
		System.out.println();
		System.out.println("=====================================================================");
		System.out.println("||                    🌿 Bem-vindo à Frutaria 2.0! 🍎               ||");
		System.out.println("=====================================================================");
		System.out.println("||                                                                  ||");
		System.out.println("||   1 - 📝 Cadastrar Produtos                                      ||");
		System.out.println("||   2 - 🍉 Listar Produtos                                         ||");
		System.out.println("||   3 - ❌ Remover Produtos                                        ||");
		System.out.println("||   4 - 🔍 Pesquisar Produtos                                      ||");
		System.out.println("||   0 - 🚪 Sair                                                   ||");
		System.out.println("=====================================================================");
		System.out.print("➡️  Sua escolha: ");
		int escolha = input.nextInt();
		input.nextLine();
		System.out.println();
		return escolha;
	}

	public Produto escolhaCadastrar(Produto produto) {
		System.out.println();
		System.out.println("========= 🍓 Cadastro de Fruta =========");
		System.out.print("Nome da fruta: 🍓 ");
		String nome = input.nextLine();

		System.out.print("Preço da fruta: 💲 ");
		double preco = input.nextDouble();
		input.nextLine();

		System.out.print("Quantidade disponível: 📦 ");
		int quantidade = input.nextInt();
		input.nextLine();

		System.out.print("Peso da fruta (kg): ⚖️ ");
		double peso = input.nextDouble();
		input.nextLine();

		produto = new Fruta(nome, preco, quantidade, peso);

		System.out.println("✅ Fruta cadastrada com sucesso!");
		System.out.println("=====================================");
		System.out.println();

		return produto;
	}

	public Produto cadastrarVerdura(Produto produto) {
		System.out.println();
		System.out.println("======= 🥦 Cadastro de Verdura =======");
		System.out.print("Nome da verdura: ");
		String nome = input.nextLine();

		System.out.print("Preço: 💲 ");
		double preco = input.nextDouble();
		input.nextLine();

		System.out.print("Quantidade: 📦 ");
		int quantidade = input.nextInt();
		input.nextLine();

		System.out.print("Tipo da verdura: 🌿 ");
		String tipo = input.nextLine();

		produto = new Verdura(nome, preco, quantidade, tipo);

		System.out.println("✅ Verdura cadastrada com sucesso!");
		System.out.println();

		return produto;
	}

	public void menuExcluir() {
		System.out.println();
		System.out.println("=====================================================================");
		System.out.println("||        ❌ Qual a Categoria do item que deseja remover?           ||");
		System.out.println("=====================================================================");
	}

	public int escolhaItemCadastro() {
		System.out.println("O que deseja cadastrar?");
		System.out.println("1️⃣ - Fruta");
		System.out.println("2️⃣ - Verdura");
		System.out.print("➡️  Sua escolha: ");
		int escolha = input.nextInt();
		input.nextLine();
		return escolha;
	}

	public int escolhaListar() {
		System.out.println("➤ Em qual categoria deseja listar?");
		System.out.println("1️⃣ - Produto");
		System.out.println("2️⃣ - Fruta");
		System.out.println("3️⃣ - Verdura");
		System.out.print("➡️  Sua escolha: ");
		int escolha = input.nextInt();
		input.nextLine();
		return escolha;
	}

	public int escolhaCategoriaExcluir() {
		System.out.println("➤ Em qual categoria deseja remover?");
		System.out.println("1️⃣ - Fruta");
		System.out.println("2️⃣ - Verdura");
		System.out.print("➡️  Sua escolha: ");
		int escolha = input.nextInt();
		input.nextLine();
		return escolha;
	}

	public String pesquisarProduto() {
		System.out.print("🔍 Insira o nome do produto:\n➡️  ");
		return input.nextLine();
	}

	public String escolhaExcluirFruta() {
		System.out.print("➡️  Insira o Nome da Fruta: ");
		return input.nextLine();
	}

	public String escolhaExcluirVerdura() {
		System.out.print("➡️  Insira o Nome da Verdura: ");
		return input.nextLine();
	}

	public void msgCadastrado() {
		System.out.println("==== ITENS CADASTRADOS ====\n");
	}

	public void listarProduto(Produto p, int cont) {
		System.out.println(cont + ": " + p.getNome());
		System.out.println("=================================");
	}

	public void listarProduto(Produto p) {
		System.out.println(p);
		System.out.println("=================================");
	}

	public void estoqueVazio() {
		System.out.println("=============================");
		System.out.println("       Estoque Vazio!!!       ");
		System.out.println("=============================");
	}
}
