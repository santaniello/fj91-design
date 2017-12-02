package br.com.design.observerstrategy;

/**
 * Strategy
 * */
public class Google implements Autenticacao {

	@Override
	public boolean autentica(Login login) {
		System.out.println("Google");
		return true;
	}

	

}
