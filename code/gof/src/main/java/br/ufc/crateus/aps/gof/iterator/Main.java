package br.ufc.crateus.aps.gof.iterator;

public class Main {

	public static void main(String[] args) {
		
		Fila fila = new Fila();
		fila.add(new Pessoa("Maria"));
		fila.add(new Pessoa("Joana"));
		fila.add(new Pessoa("Julia"));
		fila.add(new Pessoa("Renata"));
		fila.add(new Pessoa("Antonia"));
		
		while (fila.hasNext()) {
			Pessoa p = fila.next();
			System.out.println(p);
		}
	}
}
