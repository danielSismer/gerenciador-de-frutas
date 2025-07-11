package com.appFrutaria.service;

import java.util.List;
import java.util.ArrayList;
import com.appFrutaria.model.Fruta;
import com.appFrutaria.model.Produto;
import com.appFrutaria.model.Verdura;
import com.appFrutaria.view.Atendente;

public class Estoque {

	private List<Fruta> estoqueFrutas;
	private List<Verdura> estoqueVerduras;
	private List<Produto> estoqueProdutos;

	public Estoque() {
		estoqueFrutas = new ArrayList<>();
		estoqueVerduras = new ArrayList<>();
		estoqueProdutos = new ArrayList<>();
	}

	public List<Fruta> getEstoqueFrutas() { return estoqueFrutas; }

	public void setEstoqueFrutas(List<Fruta> estoqueFrutas) { this.estoqueFrutas = estoqueFrutas; }

	public void gerenciarEstoque(int opcao, Atendente atendente, Fruta fruta, Verdura verdura, Produto produto) {

		switch (opcao) {

			case 1:
				int escolhaCadastrar = atendente.escolhaItemCadastro();

				if (escolhaCadastrar == 1) {
					produto = atendente.cadastrarProduto(produto);
					estoqueProdutos.add(produto);
				} else if (escolhaCadastrar == 2) {
					fruta = atendente.escolhaCadastrar(fruta);
					estoqueFrutas.add(fruta);
					estoqueProdutos.add(fruta);
				} else if (escolhaCadastrar == 3) {
					verdura = atendente.cadastrarVerdura(verdura);
					estoqueVerduras.add(verdura);
					estoqueProdutos.add(verdura);
				}
				break;

			case 2:
				if (estoqueFrutas.isEmpty()) {
					System.out.println("Nenhuma fruta encontrada!!!");
				} else {
					for (Fruta a : estoqueFrutas) {
						System.out.println(a);
						System.out.println("---------------");
					}
				}
				break;

			case 3:
				atendente.escolhaExcluir();

				int contadorFruta = 1;
				for (Fruta a : estoqueFrutas) {
					System.out.println(contadorFruta + " - " + a.getNome());
					contadorFruta++;
				}

				int itemRemoverFruta = atendente.escolherFrutaExcluir();
				if(itemRemoverFruta > 0 && itemRemoverFruta <= estoqueFrutas.size()) {
					estoqueFrutas.remove(itemRemoverFruta - 1);
					System.out.println("|------------------------|");
					atendente.atualizarEstoque();
				} else {
					System.out.println("Opção inválida para remoção de fruta.");
				}

				contadorFruta = 1;
				for (Fruta a : estoqueFrutas) {
					System.out.println(contadorFruta + " - " + a.getNome());
					contadorFruta++;
				}
				break;



			case 4:
				if (estoqueVerduras.isEmpty()) {
					System.out.println("Nenhuma verdura encontrada!!!");
				} else {
					for (Verdura v : estoqueVerduras) {
						System.out.println(v);
						System.out.println("---------------");
					}
				}
				break;

			case 5:
				atendente.escolhaExcluir();

				int contadorVerdura = 1;
				for (Verdura v : estoqueVerduras) {
					System.out.println(contadorVerdura + " - " + v.getNome());
					contadorVerdura++;
				}

				int itemRemoverVerdura = atendente.escolherVerduraExcluir();
				if(itemRemoverVerdura > 0 && itemRemoverVerdura <= estoqueVerduras.size()) {
					estoqueVerduras.remove(itemRemoverVerdura - 1);
					System.out.println("|------------------------|");
					atendente.atualizarEstoque();
				} else {
					System.out.println("Opção inválida para remoção de verdura.");
				}

				contadorVerdura = 1;
				for (Verdura v : estoqueVerduras) {
					System.out.println(contadorVerdura + " - " + v.getNome());
					contadorVerdura++;
				}
				break;

			case 6:
				if (estoqueProdutos.isEmpty()) {
					System.out.println("Nenhum produto encontrado!!!");
				} else {
					for (Produto p : estoqueProdutos) {
						System.out.println(p);
						System.out.println("---------------");
					}
				}
				break;

			case 7:
				atendente.escolhaExcluir();

				int cont = 1;
				for (Produto p : estoqueProdutos) {
					System.out.println(cont + " - " + p.getNome());
					cont++;
				}

				int itemRemoverProduto = atendente.escolherProdutoExcluir();
				if(itemRemoverProduto > 0 && itemRemoverProduto <= estoqueProdutos.size()) {
					estoqueProdutos.remove(itemRemoverProduto - 1);
					System.out.println("|------------------------|");
					atendente.atualizarEstoque();
				} else {
					System.out.println("Opção inválida para remoção de produto.");
				}

				cont = 1;
				for (Produto p : estoqueProdutos) {
					System.out.println(cont + " - " + p.getNome());
					cont++;
				}
				break;

			case 8:

				int escolhaPesquisar = atendente.escolhaPesquisar();

				if (escolhaPesquisar == 1 ){
					String nomeProduto = atendente.pesquisarProduto();

					for (int i = 0; i < estoqueProdutos.size(); i++) {
						if (estoqueProdutos.get(i).getNome().equals(nomeProduto)) {
							estoqueProdutos.get(i);
						}
					}
				} else if (escolhaPesquisar == 2 ){
					String nomeFruta = atendente.pesquisarFruta();
					for (int i = 0; i < estoqueFrutas.size(); i++) {
						if (estoqueFrutas.get(i).getNome().equals(nomeFruta)) {
							estoqueFrutas.get(i);
						}
					}

				} else if (escolhaPesquisar == 3 ){
					String nomeVerdura = atendente.pesquisarVerdura();
					for(int i = 0; i < estoqueVerduras.size(); i++) {
						if (estoqueVerduras.get(i).getNome().equals(nomeVerdura)) {
							estoqueVerduras.get(i);
						}
					}
				}

			case 0:
				System.out.println("Saindo do sistema de estoque.");
				break;

			default:
				System.out.println("Opção inválida.");
		}
	}
}
