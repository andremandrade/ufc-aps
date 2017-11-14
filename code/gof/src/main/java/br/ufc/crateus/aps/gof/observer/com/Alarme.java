package br.ufc.crateus.aps.gof.observer.com;

import java.util.ArrayList;
import java.util.List;

public class Alarme {

	private String nome;
	private List<AlarmeListener> listeners = new ArrayList<AlarmeListener>();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addListener(AlarmeListener listener) {
		listeners.add(listener);
	}
	
	public void dispararPresenca() {
		for (AlarmeListener listener : listeners) {
			listener.notificar(TipoAlarme.presenca);
		}
	}
	
	public void dispararIncendio() {
		for (AlarmeListener listener : listeners) {
			listener.notificar(TipoAlarme.incendio);
		}
	}
}
