package com.appFrutaria.service;

import java.util.List;
import java.util.ArrayList;
import com.appFrutaria.model.Fruta;
import com.appFrutaria.view.Atendente;

public class Estoque {

	private List<Fruta> estoqueFrutas;

	public Estoque() { estoqueFrutas = new ArrayList<>();}

	public List<Fruta> getEstoqueFrutas() { return estoqueFrutas; }

	public void setEstoqueFrutas(List<Fruta> estoqueFrutas) { this.estoqueFrutas = estoqueFrutas; }
	

	public void gerenciarEstoque(int opcao, Atendente atendente, Fruta fruta) {
		
		switch (opcao) {
		
		case 1:
			
			fruta = atendente.escolhaCadastrar(fruta);
			estoqueFrutas.add(fruta);
			
			break;
			
		case 2:
			
			for (Fruta a : estoqueFrutas ) {
				
				System.out.println(a);
				
				System.out.println("---------------");
			}
			
			break;
		
		case 3: 
			
			atendente.escolhaExcluir();

			for (int cont = 0; cont < 1; cont++) {
				int contador = 1;
				for (Fruta a: estoqueFrutas) {
					
					System.out.println( + contador + " - "+ a.getNome());
					contador++;
				}
			}
				
		int itemRemover =	atendente.escolherFrutaExcluir();
		int itemAtualizado = itemRemover -1;
		estoqueFrutas.remove(itemAtualizado);
		
		System.out.println("|------------------------|");	
		
		atendente.atualizarEstoque();

		for (int cont = 0; cont < 1; cont++) {
			int contador = 1;
			for (Fruta a: estoqueFrutas) {
				
				System.out.println( + contador + " - "+ a.getNome());
				contador++;
			}	
		}
			break;
			
		case 0:
		
			
			
		default:

}

}
	

}

