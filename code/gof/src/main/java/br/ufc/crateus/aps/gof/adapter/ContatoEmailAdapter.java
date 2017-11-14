package br.ufc.crateus.aps.gof.adapter;

public class ContatoEmailAdapter extends ContatoEmail implements DestinatarioAdapter{
	
	public ContatoEmailAdapter(String email) {
		setEmail(email);
	}

	public void enviarMensagem(String mensagem) {
		enviarEmail(mensagem);
	}

}
