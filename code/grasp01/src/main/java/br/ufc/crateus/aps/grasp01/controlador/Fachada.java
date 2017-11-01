package br.ufc.crateus.aps.grasp01.controlador;

import br.ufc.crateus.aps.grasp01.controlador.entidade.Permissao;
import br.ufc.crateus.aps.grasp01.controlador.entidade.Usuario;
import br.ufc.crateus.aps.grasp01.controlador.repositorio.UsuarioRepositorio;

public class Fachada {

	public static void pesquisarProdutos(Usuario u, String nome) {
		if (u.getPerfil().getPermissoes().contains(Permissao.pesquisar_produto)) {
			System.out.println(u.getLogin() + "realizou pesquisarProdutos");
		} else {
			System.out.println(u.getLogin() + " nao tem permissao");
		}
	}
	
	public static Usuario autenticar(String login, String senha) {
		return UsuarioRepositorio.getUsuarioPorLogin(login);
	}

	public static Usuario buscarUsuario(Usuario u, String nome)
	{
		if (autenticar(u.getLogin(), u.getSenha()) == null)
			return null;
		return UsuarioRepositorio.getUsuarioPorNome(nome);
	}

}
