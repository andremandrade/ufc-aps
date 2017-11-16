package br.ufc.crateus.aps.gof.decorator.com;

public class Main {

	public static void main(String[] args) {
		Diretorio d0 = new Diretorio();
		d0.setNome("d0");
		
		ArquivoTexto a1 = new ArquivoTexto();
		a1.setNome("a1");
		a1.setTamanho(10);
		ArquivoVideo a2 = new ArquivoVideo();
		a2.setNome("a2");
		a2.setTamanho(8098);
		a2.setCodec("AVI");
		ArquivoTexto a3 = new ArquivoTexto();
		a3.setNome("a3");
		a3.setTamanho(35);
		Diretorio d1 = new Diretorio();
		d1.setNome("d1");
		Diretorio d2 = new Diretorio();
		d2.setNome("d2");
		
		d0.addItem(a1);
		d0.addItem(a2);
		d0.addItem(d1);
		d0.addItem(d2);
		
		ArquivoTexto a11 = new ArquivoTexto();
		a11.setNome("a11");
		ArquivoVideo a12 = new ArquivoVideo();
		a12.setNome("a12");
		a12.setTamanho(9982234);
		a12.setCodec("MPEG4");
		
		d1.addItem(a11);
		d1.addItem(a12);
		
		ArquivoTexto a21 = new ArquivoTexto();
		a21.setNome("a21");
		d2.addItem(a21);
		
		d0.print("");
	}

}
