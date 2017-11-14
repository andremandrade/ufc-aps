package br.ufc.crateus.aps.gof.abstractfactory;

public class Main {

	public static void main(String[] args) {
		
		ImpressoraFiscal impressoraFiscal = 
				new ImpressoraFiscalFactory().getImpressora();
		ImpressoraMatricial impressoraMatricial = 
				new ImpressoraMatricialFactory().getImpressora();
		
		impressoraFiscal.imprimir("123", "texto fiscal");
		impressoraMatricial.imprimir("texto matricial");
	}

}
