package br.ufc.crateus.aps.gof.adapter;

public class Main {

	public static void main(String[] args) {
		DestinatarioAdapter destinatarioEmail = new ContatoEmailAdapter("teste@gmail.com");
		DestinatarioAdapter destinatarioTelefone = new ContatoTelefoneAdapter("+558899445500");
		
		enviarMensagem(destinatarioEmail, destinatarioTelefone);
	}

	private static void enviarMensagem(DestinatarioAdapter... destinatarios) {
		for (DestinatarioAdapter d : destinatarios) {
			d.enviarMensagem("Teste de mensagem");
		}
	}

}
