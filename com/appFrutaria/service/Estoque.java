package com.appFrutaria.service;

import java.util.List;
import java.util.ArrayList;
import com.appFrutaria.model.Fruta;
import com.appFrutaria.model.Produto;
import com.appFrutaria.model.Verdura;
import com.appFrutaria.view.Atendente;

public class Estoque {


	private List<Produto> estoqueProdutos;

	public Estoque() {
		estoqueProdutos = new ArrayList<>();
	}

	public void gerenciarEstoque(int opcao, Atendente atendente, Fruta fruta, Verdura verdura, Produto produto) {

		switch (opcao) {

			case 1 -> {

				int escolhaCadastrar = atendente.escolhaItemCadastro();

				if (escolhaCadastrar == 1) { produto = atendente.escolhaCadastrar(produto); estoqueProdutos.add(produto);}

				else if (escolhaCadastrar == 2) { produto = atendente.cadastrarVerdura(produto); estoqueProdutos.add(produto); }

			}

			case 2 -> {

				int cont = 1;
				opcao = atendente.escolhaListar();
				atendente.msgCadastrado();
				System.out.println();

				if  (opcao == 1) { for (Produto p : estoqueProdutos) { atendente.listarProduto(p, cont); cont++; } }

				else if (opcao == 2) { for (Produto p : estoqueProdutos) { if (p instanceof Fruta f ) {  atendente.listarProduto(f, cont); cont++; } } }

				else if  (opcao == 3) {	for (Produto p : estoqueProdutos) { if (p instanceof Verdura v) {  atendente.listarProduto(v, cont); cont++; } } }

			}

			case 3 -> {

				int cont = 1;
				atendente.menuExcluir();
				opcao = atendente.escolhaCategoriaExcluir();

				if (opcao != 1 && opcao != 2){
					atendente.opcaoInvalida();
					return;
				}
				if (opcao == 1) {
					boolean semFruta = estoqueProdutos.stream().noneMatch(product -> product instanceof Fruta);

					if (semFruta) {
						atendente.estoqueVazio();
						break;
					} else {
						for (Produto p : estoqueProdutos) {
							if (p instanceof Fruta f) {
								System.out.println();
								atendente.listarProduto(f, cont);
								cont++;
							}
						}
					}

					String nomeFruta = atendente.escolhaExcluirFruta();

					for (int i = estoqueProdutos.size() - 1; i >= 0; i--) {
						Produto p = estoqueProdutos.get(i);
						if (nomeFruta.equals(p.getNome())) {
							estoqueProdutos.remove(i);
						}
					}
				}

				else if (opcao == 2) {
					boolean semVerdura = estoqueProdutos.stream().noneMatch(product -> product instanceof Verdura);

					if (semVerdura) {
						atendente.estoqueVazio();
						break;
					} else {
						for (Produto p : estoqueProdutos) {
							if (p instanceof Verdura v) {
								System.out.println();
								atendente.listarProduto(v, cont++);
							}
						}
					}

					String nomeVerdura = atendente.escolhaExcluirVerdura();

					for (int i = estoqueProdutos.size() - 1; i >= 0; i--) {
						Produto p = estoqueProdutos.get(i);
						if (nomeVerdura.equals(p.getNome())) {
							estoqueProdutos.remove(i);
						}
					}
				}

			}

			case 4 -> {

				String itemPesquisar = atendente.pesquisarProduto();

				for (Produto p : estoqueProdutos) {
					if (p.getNome().equalsIgnoreCase(itemPesquisar)) {
						atendente.listarProduto(p);
					} else {
						atendente.produtoNaoEncontrado();
						break;
					}
				}
			}

			case 0 -> {
				System.exit(0);
			}

			default -> {
				System.out.println("Opção inválida.");
			}
		}

	}
}
