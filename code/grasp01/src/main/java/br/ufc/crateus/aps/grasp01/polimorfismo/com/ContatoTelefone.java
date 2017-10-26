package br.ufc.crateus.aps.grasp01.polimorfismo.com;

import br.ufc.crateus.aps.grasp01.polimorfismo.util.MensageiroUtil;

public class ContatoTelefone extends Contato {
	
	public String getTelefone() {
		return getValor();
	}

	public void enviarMensagem(String mensagem) {
		MensageiroUtil.enviarEmail(mensagem, getTelefone());
	}
}
