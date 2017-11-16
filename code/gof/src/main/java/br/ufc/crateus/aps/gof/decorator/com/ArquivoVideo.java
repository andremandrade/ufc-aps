package br.ufc.crateus.aps.gof.decorator.com;

public class ArquivoVideo extends Item {

	private float tamanho;
	private String codec;

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public void print(String prefix) {
		System.out.println(prefix + getNome() + " ("+ getCodec() + ") - " + getTamanho() + "kb");
	}

	public String getCodec() {
		return codec;
	}

	public void setCodec(String codec) {
		this.codec = codec;
	}
}
