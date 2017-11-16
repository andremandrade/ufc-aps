package br.ufc.crateus.aps.gof.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite extends Component {

	private List<Component> items = new ArrayList<Component>();

	public Composite() {
		super();
	}

	@Override
	public List<Component> getItems() {
		return items;
	}

	@Override
	public void addItem(Component item) {
		this.items.add(item);
	}
	
	@Override
	public String toString() {
		return getNome();
	}

}