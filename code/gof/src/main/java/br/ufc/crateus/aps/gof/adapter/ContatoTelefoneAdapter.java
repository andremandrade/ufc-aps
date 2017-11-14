package br.ufc.crateus.aps.gof.adapter;

public class ContatoTelefoneAdapter extends ContatoTelefone implements DestinatarioAdapter {

	public ContatoTelefoneAdapter(String telefone) {
		setTelefone(telefone);
	}

	public void enviarMensagem(String mensagem) {
		enviarSMS(mensagem);
	}
}
