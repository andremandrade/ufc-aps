package br.ufc.crateus.aps.gof.abstractfactory;

public class ImpressoraSamsung implements ImpressoraFiscal {

	public void imprimir(String coo, String texto) {
		System.out.println("Samsung -> " + coo + " - " + texto);
		
	}


}
