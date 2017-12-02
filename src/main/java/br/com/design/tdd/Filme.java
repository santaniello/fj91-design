package br.com.design.tdd;

import java.time.Duration;

public class Filme {
	private String nome;
	private Duration duracao;
	
	public Filme(String nome, Duration duracao) {
		this.nome = nome;
		this.duracao = duracao;
	}
	
	public Duration getDuracao(){
		return duracao;
	}
	
	public String getNome(){
		return nome;
	}

}
