package br.ufc.crateus.aps.gof.decorator;

public class PizzaDecorator extends  Pizza{

	private Pizza pizza;
	
	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getNome() {
		return pizza.getNome() + " + " + super.getNome();
	}
	
	@Override
	public float getPreco() {
		return pizza.getPreco() + super.getPreco();
	}
}
