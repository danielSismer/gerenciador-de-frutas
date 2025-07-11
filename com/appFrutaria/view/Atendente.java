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

	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}

	public int menuPrincipal() {
		System.out.println();
		System.out.println("=====================================================================");
		System.out.println("||                      🌿 Bem-vindo à Frutaria 2.0! 🍎              ||");
		System.out.println("=====================================================================");
		System.out.println("||                                                                 ||");
		System.out.println("||   1 - 📝 Cadastrar Produtos                                     ||");
		System.out.println("||   2 - 🍉 Listar Frutas                                          ||");
		System.out.println("||   3 - ❌ Remover Frutas                                         ||");
		System.out.println("||   4 - 🥦 Listar Verduras                                        ||");
		System.out.println("||   5 - ❌ Remover Verduras                                       ||");
		System.out.println("||   6 - 📦 Listar Produtos                                        ||");
		System.out.println("||   7 - ❌ Remover Produtos                                       ||");
		System.out.println("||   8 - 🔍 Pesquisar Produtos                                    ||");
		System.out.println("||   0 - 🚪 Sair                                                  ||");
		System.out.println("||                                                                 ||");
		System.out.println("=====================================================================");
		System.out.print("➡️  Sua escolha: ");

		int escolha = input.nextInt();
		System.out.println();
		return escolha;
	}

	public Fruta escolhaCadastrar(Fruta fruta) {
		System.out.println();
		System.out.println("========= 🍓 Cadastro de Fruta =========");

		System.out.print("Nome da fruta: 🍓 ");
		String nome = input.next();

		System.out.print("Preço da fruta: 💲 ");
		double preco = input.nextDouble();

		System.out.print("Quantidade disponível: 📦 ");
		int quantidade = input.nextInt();

		System.out.print("Peso da fruta (kg): ⚖️ ");
		double peso = input.nextDouble();

		fruta = new Fruta(nome, preco, quantidade, peso);

		System.out.println("✅ Fruta cadastrada com sucesso!");
		System.out.println("=====================================");
		System.out.println();

		return fruta;
	}

	public void escolhaExcluir() {
		System.out.println();
		System.out.println("=====================================================================");
		System.out.println("||                     ❌ Qual item deseja remover?                ||");
		System.out.println("=====================================================================");
	}

	public int escolherFrutaExcluir() {
		System.out.print("➡️  Digite o número da fruta para remover: ");
		return input.nextInt();
	}

	public int escolherVerduraExcluir() {
		System.out.print("➡️  Digite o número da verdura para remover: ");
		return input.nextInt();
	}

	public int escolherProdutoExcluir() {
		System.out.print("➡️  Digite o número do produto para remover: ");
		return input.nextInt();
	}

	public void atualizarEstoque() {
		System.out.println();
		System.out.println("=====================================================================");
		System.out.println("||                ✅ Estoque atualizado com sucesso!               ||");
		System.out.println("=====================================================================");
		System.out.println();
	}

	public String pesquisar() {
		input.nextLine();
		System.out.print("🔍 Insira o nome da fruta para pesquisa:\n➡️  ");
		return input.nextLine();
	}

	public int escolhaItemCadastro() {
		System.out.println("O que deseja cadastrar?");
		System.out.println("1️⃣ - Produto");
		System.out.println("2️⃣ - Fruta");
		System.out.println("3️⃣ - Verdura");
		System.out.print("➡️  Sua escolha: ");
		return input.nextInt();
	}

	public Produto cadastrarProduto(Produto produto) {
		System.out.println();
		System.out.println("======= 📦 Cadastro de Produto =======");

		System.out.print("Nome do produto: ");
		String nome = input.next();

		System.out.print("Preço: 💲 ");
		double preco = input.nextDouble();

		System.out.print("Quantidade: 📦 ");
		int quantidade = input.nextInt();

		produto = new Produto(nome, preco, quantidade);

		System.out.println("✅ Produto cadastrado com sucesso!");
		System.out.println();

		return produto;
	}

	public Verdura cadastrarVerdura(Verdura verdura) {
		System.out.println();
		System.out.println("======= 🥦 Cadastro de Verdura =======");

		System.out.print("Nome da verdura: ");
		String nome = input.next();

		System.out.print("Preço: 💲 ");
		double preco = input.nextDouble();

		System.out.print("Quantidade: 📦 ");
		int quantidade = input.nextInt();

		input.nextLine();

		System.out.print("Tipo da verdura: 🌿 ");
		String tipo = input.nextLine();

		verdura = new Verdura(nome, preco, quantidade, tipo);

		System.out.println("✅ Verdura cadastrada com sucesso!");
		System.out.println();

		return verdura;
	}

	public int escolhaPesquisar() {
		System.out.println("🔎 Em qual categoria deseja pesquisar?");
		System.out.println("1️⃣ - Produto");
		System.out.println("2️⃣ - Fruta");
		System.out.println("3️⃣ - Verdura");
		System.out.print("➡️  Sua escolha: ");

		return input.nextInt();
	}

	public String pesquisarProduto() {
		input.nextLine();
		System.out.print("🔍 Insira o nome do produto:\n➡️  ");
		return input.nextLine();
	}

	public String pesquisarFruta() {
		input.nextLine();
		System.out.print("🔍 Insira o nome da fruta:\n➡️  ");
		return input.nextLine();
	}

	public String pesquisarVerdura() {
		input.nextLine();
		System.out.print("🔍 Insira o nome da verdura:\n➡️  ");
		return input.nextLine();
	}
}
