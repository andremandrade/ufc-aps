package br.ufc.crateus.aps.tdd;

import br.ufc.crateus.aps.tdd.controlador.Fachada;
import br.ufc.crateus.aps.tdd.entidade.Usuario;

public class Main {

	public static void main(String[] args) {
		String login = "admin";
		String senha = "123";
		
		Usuario u = Fachada.autenticar(login, senha);
		
		Usuario usuarioEncontrado = Fachada.buscarUsuario(u, "Pedro");
		
		
	}
}
