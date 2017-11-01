package br.ufc.crateus.aps.grasp01.indirecao.com;

public class Fachada {

	public void pesquisarProdutos(Usuario u, String nome) {
		if (u.getPerfil().getPermissoes().contains(Permissao.pesquisar_produto)) {
			System.out.println(u.getLogin() + "realizou pesquisarProdutos");
		} else {
			System.out.println(u.getLogin() + " nao tem permissao");
		}
	}
	
	public void criarUsuario(Usuario u, String nome) {
		if (u.getPerfil().getPermissoes().contains(Permissao.cadastrar_usuario)) {
			System.out.println(u.getLogin() + "realizou criarUsuario");
		} else {
			System.out.println(u.getLogin() + " nao tem permissao");
		}
	}
	
	public void vender(Usuario u, String nome) {
		if (u.getPerfil().getPermissoes().contains(Permissao.vender)) {
			System.out.println(u.getLogin() + "realizou vender");
		} else {
			System.out.println(u.getLogin() + " nao tem permissao");
		}
	}

}
