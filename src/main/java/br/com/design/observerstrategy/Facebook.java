package br.com.design.observerstrategy;

/**
 * Strategy
 * */
public class Facebook implements Autenticacao {

	@Override
	public boolean autentica(Login login) {
		System.out.println("Facebook");
		return true;
	}

}
