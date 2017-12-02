package br.com.design.observerstrategy;

public class Login {
	private String usuario;
	private String senha;
	private ProvedorEnum provedor;

	public Login(String usuario, String senha, ProvedorEnum provedor) {
		this.usuario = usuario;
		this.senha = senha;
		this.provedor = provedor;
	}
	
	// O usuário será autenticado de acordo com o provedor...
	public boolean autentica(){
		return this.provedor.autentica(this);
	}	
}
