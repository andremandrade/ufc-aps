package br.ufc.crateus.aps.grasp01.controlador;

import br.ufc.crateus.aps.grasp01.controlador.entidade.Usuario;

public class Main {

	public static void main(String[] args) {
		String login = "admin";
		String senha = "123";
		
		Usuario u = Fachada.autenticar(login, senha);
		
		Usuario usuarioEncontrado = Fachada.buscarUsuario(u, "Pedro");
		
		
	}
}
