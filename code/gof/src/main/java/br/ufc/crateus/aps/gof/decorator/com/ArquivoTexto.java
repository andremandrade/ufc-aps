package br.ufc.crateus.aps.gof.decorator.com;

public class ArquivoTexto extends Item {

	private float tamanho;

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public void print(String prefix) {
		System.out.println(prefix + getNome() + " - " + getTamanho() + "kb");
	}
}
