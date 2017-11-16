package br.ufc.crateus.aps.gof.composite;

public class ArquivoTexto extends Component {

	private float tamanho;

	public ArquivoTexto(String nome, float tamanho) {
		setNome(nome);
		setTamanho(tamanho);
	}

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
