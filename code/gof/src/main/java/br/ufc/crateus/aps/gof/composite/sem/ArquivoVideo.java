package br.ufc.crateus.aps.gof.composite.sem;

public class ArquivoVideo extends Item {

	private float tamanho;
	private String codec;

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public String getCodec() {
		return codec;
	}

	public void setCodec(String codec) {
		this.codec = codec;
	}
	
	@Override
	public String toString() {
		return getNome() + " ("+ getCodec() + ") - " + getTamanho() + "kb";
	}
}
