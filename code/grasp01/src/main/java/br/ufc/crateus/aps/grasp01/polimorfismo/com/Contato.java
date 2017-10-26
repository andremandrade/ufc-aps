package br.ufc.crateus.aps.grasp01.polimorfismo.com;

public abstract class Contato implements Destinatario{
	private String valor;

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
