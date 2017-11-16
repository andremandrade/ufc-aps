package br.ufc.crateus.aps.gof.composite.com;

public class ArquivoVideo extends Component {

	private float tamanho;
	private String codec;

	public ArquivoVideo(String nome, float tamanho, String codec) {
		setNome(nome);
		setTamanho(tamanho);
		setCodec(codec);
	}

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
