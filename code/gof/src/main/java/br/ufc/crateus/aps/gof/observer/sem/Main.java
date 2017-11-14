package br.ufc.crateus.aps.gof.observer.sem;

public class Main {

	public static void main(String[] args) {
		Alarme alarme = new Alarme();
		
		alarme.setProprietario(new Proprietario());
		alarme.setServicoPolicial(new ServicoPolicial());
		alarme.setPortaoEletrico(new PortaoEletrico());
		
		alarme.disparar();
	}
}
