package br.ufc.crateus.aps.gof.observer.com;

public class PortaoEletrico implements AlarmeListener{

	public void fechar() {
		System.out.println("PortaoEletrico fechar");
	}

	public void notificar(TipoAlarme tipo) {
		System.out.println(tipo);
		fechar();
	}
}
