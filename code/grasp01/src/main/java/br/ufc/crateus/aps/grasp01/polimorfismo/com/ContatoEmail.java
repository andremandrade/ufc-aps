package br.ufc.crateus.aps.grasp01.polimorfismo.com;

import br.ufc.crateus.aps.grasp01.polimorfismo.util.MensageiroUtil;

public class ContatoEmail extends Contato{
	
	public String getEmail() {
		return getValor();
	}

	public void enviarMensagem(String mensagem) {
		MensageiroUtil.enviarEmail(mensagem, getEmail());
	}
}
