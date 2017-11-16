package br.ufc.crateus.aps.gof.decorator.sem;

public class ArquivoTexto extends Item {

	private float tamanho;

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public String toString() {
		return getNome() + " - " + getTamanho() + "kb";
	}

}
