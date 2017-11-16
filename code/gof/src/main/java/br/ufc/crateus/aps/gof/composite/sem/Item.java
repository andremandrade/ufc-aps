package br.ufc.crateus.aps.gof.composite.sem;

public abstract class Item {

	private String nome;

	public Item() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}