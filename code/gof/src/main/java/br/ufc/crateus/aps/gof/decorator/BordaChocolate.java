package br.ufc.crateus.aps.gof.decorator;

public class BordaChocolate extends PizzaDecorator{
	
	public BordaChocolate(Pizza pizza) {
		super(pizza);
		setNome("Borda  de Chocolate");
		setPreco(5);
	}
	
}
