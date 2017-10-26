package br.ufc.crateus.aps.grasp01.polimorfismo.sem;

import br.ufc.crateus.aps.grasp01.polimorfismo.util.MensageiroUtil;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Pessoa da Silva");
		
		Contato telefone = new ContatoTelefone();
		telefone.setValor("8899776655");
		ContatoEmail email = new ContatoEmail();
		email.setValor("pessoa.silva@gmail.com");
		
		p.addContato(telefone);
		p.addContato(email);
		
		enviarMensagem("Estou chegando!", p);
	}

	private static void enviarMensagem(String mensagem, Pessoa p) {
		for (Contato c : p.getContatos()) {
			if(c instanceof ContatoEmail) {
				MensageiroUtil.enviarEmail(mensagem, ((ContatoEmail) c).getEmail());
				continue;
			}
			if(c instanceof ContatoTelefone) {
				MensageiroUtil.enviarSMA(mensagem, ((ContatoTelefone) c).getTelefone());
			}
		}
	}

}
