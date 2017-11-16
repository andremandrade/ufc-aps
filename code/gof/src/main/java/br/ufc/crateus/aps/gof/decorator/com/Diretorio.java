package br.ufc.crateus.aps.gof.decorator.com;

import java.util.ArrayList;
import java.util.List;

public class Diretorio extends Item{
	
	private List<Item> items =  new ArrayList<Item>();
	
	public List<Item> getItems() {
		return items;
	}

	public void addItem(Item item) {
		this.items.add(item);
	}

	@Override
	public void print(String prefix) {
		System.out.println(prefix + "* " + getNome());
		prefix += prefix + "    ";
		for (Item item : items) {
			item.print(prefix);
		}
	}

}
