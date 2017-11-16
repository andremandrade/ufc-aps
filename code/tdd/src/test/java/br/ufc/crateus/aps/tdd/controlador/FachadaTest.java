package br.ufc.crateus.aps.tdd.controlador;

import static org.junit.Assert.assertNull;

import org.junit.BeforeClass;
import org.junit.Test;

import br.ufc.crateus.aps.tdd.entidade.Usuario;

public class FachadaTest {

	private static Usuario admin;

	@BeforeClass
	public static void setup() {
		admin = new Usuario("admin", "123");
		Fachada.adicionarUsuario(admin);
	}

	@Test
	public void autenticarUsuarioBancoVazio() {
		Usuario u = Fachada.autenticar("admin", "123");
		assertNull(u);
		u = Fachada.autenticar("admin", "");
		assertNull(u);
	}

	@Test
	public void autenticarLoginVazioBancoVazio() {
		Usuario u;
		u = Fachada.autenticar("", "123");
		assertNull(u);
	}

	@Test
	public void autenticarSenhaVaziaBancoVazio() {
		Usuario u;
		u = Fachada.autenticar("admin", "");
		assertNull(u);
	}

}
