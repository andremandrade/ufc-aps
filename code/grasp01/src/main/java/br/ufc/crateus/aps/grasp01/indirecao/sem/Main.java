package br.ufc.crateus.aps.grasp01.indirecao.sem;

public class Main {

	public static void main(String[] args) {
		Usuario u = new Usuario();
		u.setLogin("admin");
		u.setPerfil(Perfil.vendedor);
		
		new Fachada().pesquisarProdutos(u, "prod");
	}
}
