package br.ufc.crateus.aps.gof.iterator;

public class Fila implements PessoaIterator{

	private Pessoa[] fila = new Pessoa[20];
	private int posicaoInsercao = 0;
	private int posicaoIteracao = 0;
	
	public void add(Pessoa p) {
		fila[posicaoInsercao] = p;
		posicaoInsercao ++;
	}

	public boolean hasNext() {
		return fila.length > posicaoIteracao && fila[posicaoIteracao] != null;
	}

	public Pessoa next() {
		return fila[posicaoIteracao++];
	}
	
}
