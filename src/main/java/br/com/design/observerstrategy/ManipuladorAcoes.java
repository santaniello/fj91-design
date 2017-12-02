package br.com.design.observerstrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * usando o padrão Observer...
 */
public class ManipuladorAcoes {
	
	private List<AcaoAposLogar> acoes = new ArrayList<AcaoAposLogar>();
	
	public void add(AcaoAposLogar acao){
		acoes.add(acao);
	}
	
	public void executaAcoes(Login login){
		for (AcaoAposLogar acaoAposLogar : acoes) {
			acaoAposLogar.executa(login);
		}		
	}
	
	public int getQtdAcoes(){
		return this.acoes.size();
	}
}
