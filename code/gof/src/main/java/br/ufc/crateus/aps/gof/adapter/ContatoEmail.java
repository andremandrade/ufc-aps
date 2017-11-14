package br.ufc.crateus.aps.gof.adapter;

import br.ufc.crateus.aps.gof.adapter.util.MensageiroUtil;

public class ContatoEmail {

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String valor) {
		this.email = valor;
	}
	
	public void enviarEmail(String mensagem) {
		MensageiroUtil.enviarEmail(mensagem, getEmail());
	}

}
