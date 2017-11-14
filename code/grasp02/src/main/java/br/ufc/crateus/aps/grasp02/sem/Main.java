package br.ufc.crateus.aps.grasp02.sem;

public class Main {

	public static void main(String[] args) {
		try {
			Circulo circulo = new Circulo(3);
			Triangulo triangulo = new Triangulo(2.5f);
			
			System.out.println(calcularArea(circulo));
			System.out.println(calcularArea(triangulo));
			System.out.println(calcularPerimetro(circulo));
			System.out.println(calcularPerimetro(triangulo));
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static double calcularArea(Object figura) throws Exception {
		if (figura instanceof Triangulo) {
			float lado = ((Triangulo) figura).getLado();
			return (Math.sqrt(3) * Math.pow(lado, 2)) / 4;
		}
		if (figura instanceof Circulo) {
			float raio = ((Circulo) figura).getRaio();
			return Math.PI * Math.pow(raio, 2);
		}
		throw new Exception("Tipo invalido");
	}
	
	private static double calcularPerimetro(Object figura) throws Exception {
		if (figura instanceof Triangulo) {
			float lado = ((Triangulo) figura).getLado();
			return 3 * lado;
		}
		if (figura instanceof Circulo) {
			float raio = ((Circulo) figura).getRaio();
			return 2 * Math.PI * raio;
		}
		throw new Exception("Tipo invalido");
	}
}
