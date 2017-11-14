package br.ufc.crateus.aps.gof.abstractfactory;

public class ImpressoraDaruma implements ImpressoraMatricial{

	public void imprimir(String texto) {
		System.out.println("Darauma -> " + texto);
	}

}
