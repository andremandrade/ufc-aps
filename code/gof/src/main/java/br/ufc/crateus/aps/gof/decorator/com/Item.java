package br.ufc.crateus.aps.gof.decorator.com;

public abstract class Item {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void print(String prefix);

}