package br.ufc.crateus.aps.gof.composite;

public class Main {

	public static void main(String[] args) {
		Component d0 = new Diretorio();
		d0.setNome("d0");
		
		Component a1 = new ArquivoTexto("a1", 10);
		Component a2 = new ArquivoVideo("a2",8098, "AVI");
		Component a3 = new ArquivoTexto("a3", 35);
		Component d1 = new Diretorio();
		d1.setNome("d1");
		Component d2 = new Diretorio();
		d2.setNome("d2");
		
		try {
			d0.addItem(a1);
			d0.addItem(a2);
			d0.addItem(a3);
			d0.addItem(d1);
			d0.addItem(d2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Component a11 = new ArquivoTexto("a11", 110);
		Component a12 = new ArquivoVideo("a12", 9982234, "MPEG4");
		
		try {
			d1.addItem(a11);
			d1.addItem(a12);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Component a21 = new ArquivoTexto("a21", 210);

		try {
			d2.addItem(a21);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		printDir(d0);
		
	}
	
	private static void printDir(Component dir) {
		System.out.println(dir.toString());
		try {
			for(Component item : dir.getItems()) {
				System.out.println(item.toString());
				printDir(item);
			}
		} catch (Exception e) {
//			e.printStackTrace();
		}
	}

}
