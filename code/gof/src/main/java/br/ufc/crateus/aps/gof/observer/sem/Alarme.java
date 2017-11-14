package br.ufc.crateus.aps.gof.observer.sem;

public class Alarme {

	private Proprietario proprietario;
	private ServicoPolicial servicoPolicial;
	private PortaoEletrico portaoEletrico;
	
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public ServicoPolicial getServicoPolicial() {
		return servicoPolicial;
	}

	public void setServicoPolicial(ServicoPolicial servicoPolicial) {
		this.servicoPolicial = servicoPolicial;
	}

	public PortaoEletrico getPortaoEletrico() {
		return portaoEletrico;
	}

	public void setPortaoEletrico(PortaoEletrico portaoEletrico) {
		this.portaoEletrico = portaoEletrico;
	}

	public void disparar() {
		proprietario.receberMensagem();
		servicoPolicial.enviarViaturas();
		portaoEletrico.fechar();
	}
	
}
