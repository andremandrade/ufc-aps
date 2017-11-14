package br.ufc.crateus.aps.gof.singleton;

public class ImpressoraSamsung implements Impressora {

	public void imprimirTexto(String texto) {
		System.out.println("Samsung -> " + texto);
	}

}
