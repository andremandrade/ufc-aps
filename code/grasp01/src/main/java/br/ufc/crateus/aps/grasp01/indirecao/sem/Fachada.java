package br.ufc.crateus.aps.grasp01.indirecao.sem;

public class Fachada {

	public void pesquisarProdutos(Usuario u, String nome) {
		if (u.getPerfil().equals(Perfil.admin) || u.getPerfil().equals(Perfil.cliente)) {
			System.out.println(u.getLogin() + "realizou pesquisarProdutos");
		} else {
			System.out.println(u.getLogin() + " nao tem permissao");
		}
	}
	
	public void criarUsuario(Usuario u, String nome) {
		if (u.getPerfil().equals(Perfil.admin)) {
			System.out.println(u.getLogin() + "realizou criarUsuario");
		} else {
			System.out.println(u.getLogin() + " nao tem permissao");
		}
	}
	
	public void vender(Usuario u, String nome) {
		if (u.getPerfil().equals(Perfil.admin) || u.getPerfil().equals(Perfil.vendedor)) {
			System.out.println(u.getLogin() + "realizou vender");
		} else {
			System.out.println(u.getLogin() + " nao tem permissao");
		}
	}

}
