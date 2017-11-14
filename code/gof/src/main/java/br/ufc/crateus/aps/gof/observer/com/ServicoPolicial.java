package br.ufc.crateus.aps.gof.observer.com;

public class ServicoPolicial implements AlarmeListener{
	
	public void enviarViaturas() {
		System.out.println("ServicoPolicial enviarViaturas");
	}

	public void notificar(TipoAlarme tipo) {
		System.out.println(tipo);
		enviarViaturas();
	}
}
