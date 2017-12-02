package br.com.design.observerstrategy;

/**
 * Observer
 * */
public class EnviadorEmail implements AcaoAposLogar{

	@Override
	public void executa(Login login) {
		System.out.println("Envia email()...");		
	}

}
