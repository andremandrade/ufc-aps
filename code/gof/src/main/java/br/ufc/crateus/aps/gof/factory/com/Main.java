package br.ufc.crateus.aps.gof.factory.com;

public class Main {

	public static void main(String[] args) {
		TipoImpressora tipo = TipoImpressora.daruma;
		
		Impressora impressora = new ImpressoraFactory().
					getImpressora(tipo);
		impressora.imprimirTexto("teste cupom");
	}

}
