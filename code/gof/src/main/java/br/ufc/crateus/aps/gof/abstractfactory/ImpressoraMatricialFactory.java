package br.ufc.crateus.aps.gof.abstractfactory;

public class ImpressoraMatricialFactory {
	
	public ImpressoraMatricial getImpressora() {
		return new ImpressoraDaruma();
	}
}
