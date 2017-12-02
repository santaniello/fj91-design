package br.com.design.observerstrategy;

/**
 * Usando o padrão factory...
 * 
 * */
public enum ProvedorEnum {
	FACEBOOK(new Facebook()),
	GOOGLE(new Google());
	
	private Autenticacao aut;

	// O modificador de acesso do enum deve ser package por default...
	ProvedorEnum(Autenticacao aut){
		this.aut = aut;		
	}

	public boolean autentica(Login login) {
		return aut.autentica(login);
	}	

}
