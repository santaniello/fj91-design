package br.com.design.observerstrategy;

/**
 * Observer
 */
public class Tracking implements AcaoAposLogar {

	@Override
	public void executa(Login login) {
		System.out.println("Tracking()...");
	}
}
