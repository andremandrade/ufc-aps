package br.ufc.crateus.aps.gof.factory.sem;

public class Main {

	public static void main(String[] args) {
		TipoImpressora tipo = TipoImpressora.daruma;
		
		switch (tipo) {
		case daruma:
			ImpressoraDaruma impressoraDaruma = new ImpressoraDaruma();
			impressoraDaruma.imprimirTexto("teste mensagem");
			break;

		case samsung:
			ImpressoraSamsung impressoraSamsung = new ImpressoraSamsung();
			impressoraSamsung.imprimirTexto("teste mensagem");
			break;
		default:
			break;
		}

	}

}
