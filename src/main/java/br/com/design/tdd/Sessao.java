package br.com.design.tdd;

import java.time.LocalTime;

public class Sessao {

	private LocalTime horario;
	private Filme filme;

	public Sessao(LocalTime horario, Filme filme) {
		this.horario = horario;
		this.filme = filme;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public Filme getFilme() {
		return filme;
	}	
	
	public LocalTime getHorarioFinal(){
		return horario.plus(filme.getDuracao());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((filme == null) ? 0 : filme.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this.filme.getNome() == ((Sessao)obj).getFilme().getNome()){
			return true;
		}
		return false;
	}
	
	

}
