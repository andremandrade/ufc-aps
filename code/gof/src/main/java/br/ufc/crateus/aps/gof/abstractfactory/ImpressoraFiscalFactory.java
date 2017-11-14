package br.ufc.crateus.aps.gof.abstractfactory;

public class ImpressoraFiscalFactory {
	
	public ImpressoraFiscal getImpressora() {
		return new ImpressoraSamsung();
	}
}
