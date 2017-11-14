package br.ufc.crateus.aps.gof.factory.sem;

public class ImpressoraSamsung implements Impressora {

	public void imprimirTexto(String texto) {
		System.out.println("Samsung -> " + texto);
	}

}
