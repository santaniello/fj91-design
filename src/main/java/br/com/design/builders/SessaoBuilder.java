package br.com.design.builders;

import java.time.Duration;
import java.time.LocalTime;

import br.com.design.tdd.Filme;
import br.com.design.tdd.Sessao;

public class SessaoBuilder {

	public static FilmeBuilder noHorario(LocalTime time) {
		return new FilmeBuilder(time);
	}

	public static class FilmeBuilder {

		private LocalTime time;
					
		public FilmeBuilder(LocalTime time) {
			this.time = time;
		}
		
		public Builder comFilme(String nome, Duration duracao){
			return new Builder(time,nome, duracao);
		}

	}
	
	public static class Builder{
		private LocalTime time;
		private String nome;
		private Duration duracao;
		
		public Builder(LocalTime time, String nome, Duration duracao) {
			this.time = time;
			this.nome = nome;
			this.duracao = duracao;
		}
		
		public Sessao build() {
			return new Sessao(time, new Filme(nome, duracao));
		}
	}
}
