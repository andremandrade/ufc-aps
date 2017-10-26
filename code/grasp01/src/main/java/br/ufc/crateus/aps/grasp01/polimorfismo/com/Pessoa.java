package br.ufc.crateus.aps.grasp01.polimorfismo.com;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private List<Contato> contatos = new ArrayList<Contato>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Contato> getContatos() {
		return contatos;
	}
	public void addContato(Contato contato) {
		this.contatos.add(contato);
	}
	
}
