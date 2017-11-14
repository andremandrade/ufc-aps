package br.ufc.crateus.aps.gof.singleton;

public class Main {

	public static void main(String[] args) {
		TipoImpressora tipo = TipoImpressora.daruma;
		
		Impressora impressora = ImpressoraFactory.
				getInstance().getImpressora(tipo);
		impressora.imprimirTexto("teste cupom");
	}

}
