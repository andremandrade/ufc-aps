package br.ufc.crateus.aps.gof.factory.com;

public class ImpressoraFactory {
	
	public Impressora getImpressora(TipoImpressora tipo) {
		switch (tipo) {
		case daruma:
			return new ImpressoraDaruma();
		case samsung:
			return new ImpressoraSamsung();
		default:
			break;
		}
		return null;
	}
}
