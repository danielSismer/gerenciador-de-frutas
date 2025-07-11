package com.appFrutaria;

import com.appFrutaria.model.Produto;
import com.appFrutaria.model.Verdura;
import com.appFrutaria.view.Atendente;
import com.appFrutaria.service.Estoque;
import com.appFrutaria.model.Fruta;

public class Main {

	public static void main(String[] args) {
		
		Estoque estoque = new Estoque();
		Atendente atendente = new Atendente();
		Fruta fruta = new Fruta();
		Verdura verdura = new Verdura();
		Produto produto = new Produto();
		
		while (true) {
			
			int opcao = atendente.menuPrincipal();
			
			estoque.gerenciarEstoque(opcao, atendente, fruta, verdura, produto);
			
			
			
		}
		
		
		
		
		
		

	}

}
