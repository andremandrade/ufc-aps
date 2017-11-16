package br.ufc.crateus.aps.tdd.controlador;

import br.ufc.crateus.aps.tdd.entidade.Permissao;
import br.ufc.crateus.aps.tdd.entidade.Usuario;
import br.ufc.crateus.aps.tdd.repositorio.UsuarioRepositorio;

public class Fachada {

	public static void pesquisarProdutos(Usuario u, String nome) {
		if (u.getPerfil().getPermissoes().contains(Permissao.pesquisar_produto)) {
			System.out.println(u.getLogin() + "realizou pesquisarProdutos");
		} else {
			System.out.println(u.getLogin() + " nao tem permissao");
		}
	}
	
	public static Usuario autenticar(String login, String senha) {
		Usuario u =  UsuarioRepositorio.getUsuarioPorLogin(login);
		if  (u == null) return null;
		if(senha.equals(u.getSenha()))
			return u;
		return null;
	}

	public static Usuario buscarUsuario(Usuario u, String nome)
	{
		if (autenticar(u.getLogin(), u.getSenha()) == null)
			return null;
		return UsuarioRepositorio.getUsuarioPorNome(nome);
	}

	public static void adicionarUsuario(Usuario u) {
		UsuarioRepositorio.adicionarUsuario(u);
	}

}
