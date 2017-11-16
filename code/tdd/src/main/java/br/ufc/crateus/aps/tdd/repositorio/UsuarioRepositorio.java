package br.ufc.crateus.aps.tdd.repositorio;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import br.ufc.crateus.aps.tdd.entidade.Usuario;

public class UsuarioRepositorio {

	private static Map<Integer, Usuario> repositorio = new HashMap<Integer, Usuario>();
	private static int id = 1;
	
	public static void adicionarUsuario(Usuario  u) {
		u.setId(id++);
		repositorio.put(u.getId(), u);
	}
	
	public static Usuario getUsuarioPorLogin(String login) {
		for (Entry<Integer, Usuario> idUsuario : repositorio.entrySet()) {
			if(idUsuario.getValue().getLogin().equals(login))
				return idUsuario.getValue();
		}
		return null;
	}

	public static Usuario getUsuarioPorNome(String nome) {
		for (Entry<Integer, Usuario> idUsuario : repositorio.entrySet()) {
			if(idUsuario.getValue().getLogin().contains(nome))
				return idUsuario.getValue();
		}
		return null;
	}

}
