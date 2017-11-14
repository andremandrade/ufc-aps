package br.ufc.crateus.aps.gof.observer.com;

public class Main {

	public static void main(String[] args) {
		Alarme alarme = new Alarme();
		
		alarme.addListener(new ServicoPolicial());
		alarme.addListener(new PortaoEletrico());
		alarme.addListener(new Proprietario());
		
		alarme.dispararIncendio();
		alarme.dispararPresenca();
	}
}
