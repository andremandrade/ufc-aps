package br.ufc.crateus.aps.gof.observer.com;

public class Proprietario implements AlarmeListener{

	public void receberMensagem() {
		System.out.println("Proprietario receberMensagem");
	}

	public void notificar(TipoAlarme tipo) {
		System.out.println(tipo);
		receberMensagem();
	}
}
