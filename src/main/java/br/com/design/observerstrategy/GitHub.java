package br.com.design.observerstrategy;


/**
 * Strategy
 * */
public class GitHub implements Autenticacao{

	@Override
	public boolean autentica(Login login) {
		System.out.println("GitHub");
		return true;
	}
	
	

}
