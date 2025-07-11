package com.appFrutaria.model;

public class Fruta extends Produto{

	private double peso;

	public Fruta(String nome, double preco, int quantidade, double peso) {
		super(nome, preco, quantidade);
		this.peso = peso;
	}

	public Fruta() {
		super();
		this.peso = 0;
	}

	@Override
	public String toString() {
		return  "\n----------------------------------------" +
				"\n🍎 Nome da Fruta     : " + this.nome +
				"\n💲 Preço             : R$ " + String.format("%.2f", this.preco) +
				"\n📦 Quantidade        : " + this.quantidade + " unidade(s)" +
				"\n----------------------------------------";
	}

	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

}

