package br.ufc.crateus.aps.gof.decorator;

public class Main {

	public static void main(String[] args) {
		Pizza m = new Mussarela();
		Pizza p = new Peperoni();
		
		m = new Catupiry(m);
		
		p = new BordaChocolate(p);
		p = new Catupiry(p);
		
		System.out.println(m.getNome() + " - " + m.getPreco());
		System.out.println(p.getNome() + " - " + p.getPreco());
	}

}
