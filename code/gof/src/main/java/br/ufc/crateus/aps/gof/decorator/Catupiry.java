package br.ufc.crateus.aps.gof.decorator;

public class Catupiry extends PizzaDecorator{
	
	public Catupiry(Pizza pizza) {
		super(pizza);
		setNome("Catupiry");
		setPreco(3);
	}
	
}
