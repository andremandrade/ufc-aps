package br.ufc.crateus.aps.gof.composite;

import java.util.List;


public abstract class Component {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Component> getItems() throws Exception {
		throw new Exception("Esse item eh um arquivo");
	}

	public void addItem(Component item) throws Exception {
		throw new Exception("Esse item eh um arquivo");
	}
	
	@Override
	public String toString() {
		return getNome();
	}
}