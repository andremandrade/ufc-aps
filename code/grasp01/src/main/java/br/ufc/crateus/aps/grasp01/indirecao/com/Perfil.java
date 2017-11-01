package br.ufc.crateus.aps.grasp01.indirecao.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Perfil {
	
	admin(Permissao.cadastrar_usuario, Permissao.pesquisar_produto, Permissao.vender),
	cliente(Permissao.pesquisar_produto),
	vendedor(Permissao.vender);
	
	private List<Permissao> permissoes = new ArrayList<Permissao>();
	
	private Perfil(Permissao... permissoes) {
		
		setPermissoes(Arrays.asList(permissoes));
	}

	public List<Permissao> getPermissoes() {
		return permissoes;
	}

	private void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}
}
