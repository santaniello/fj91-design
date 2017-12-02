package br.com.design.observerstrategy;

/**
 * Interface criada para ser usada pelo padrão strategy
 * 
 * */

public interface Autenticacao {
	public abstract boolean autentica(Login login);
}
