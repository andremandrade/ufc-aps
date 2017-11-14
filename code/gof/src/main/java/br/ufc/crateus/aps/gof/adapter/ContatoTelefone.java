package br.ufc.crateus.aps.gof.adapter;

import br.ufc.crateus.aps.gof.adapter.util.MensageiroUtil;

public class ContatoTelefone {
	
	private String telefone;

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String valor) {
		this.telefone = valor;
	}
	
	public void enviarSMS(String mensagem) {
		MensageiroUtil.enviarSMS(mensagem, getTelefone());
	}

}
