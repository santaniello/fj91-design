package br.com.design.tdd;

import java.util.ArrayList;
import java.util.List;

public class Sala {

	private String nome;
	// criando uma composição...
	private List<Sessao> sessoes = new ArrayList<Sessao>();

	public Sala(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void add(Sessao sessao) {
		for (Sessao sessaoAnterior : sessoes) {
			if (!sessao.getHorarioFinal().isBefore(sessaoAnterior.getHorario()) 
			 && !sessao.getHorario().isAfter(sessaoAnterior.getHorarioFinal())) {
				throw new RuntimeException("Não pode ser adicionado");
			} 
		}		
		sessoes.add(sessao);		
	}

	public int getSize() {
		return this.sessoes.size();
	}

}
