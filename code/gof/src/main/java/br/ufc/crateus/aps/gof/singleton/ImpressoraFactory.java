package br.ufc.crateus.aps.gof.singleton;

public class ImpressoraFactory {
	
	private static ImpressoraFactory impressoraFactory;
	
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

	public static synchronized ImpressoraFactory getInstance() {
		if(impressoraFactory == null)
			impressoraFactory = new ImpressoraFactory();
		return impressoraFactory;
	}
}
