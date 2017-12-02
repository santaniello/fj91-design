package br.com.design.tdd;

import java.time.Duration;
import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;

import br.com.design.builders.SessaoBuilder;

public class SessionTest {

	@Test
	public void testeSessaoComecaAntesETerminaAntes() {
	    Sessao sessao1 = SessaoBuilder.noHorario(LocalTime.of(18, 00)).comFilme("Titanic", Duration.ofHours(2)).build();
	    Sessao sessao2 = SessaoBuilder.noHorario(LocalTime.of(13, 00)).comFilme("Harry Potter", Duration.ofHours(2)).build();	    
	    Sala sala = new Sala("30");
	    sala.add(sessao1);	    
	    sala.add(sessao2);	    
	    Assert.assertTrue("A lista deve ser maior que 0!", sala.getSize() > 0);
	}
	
	@Test
	public void testeSessaoQueComecaDepoisETerminaDepois() {
		Sessao sessao1 = SessaoBuilder.noHorario(LocalTime.of(18, 00)).comFilme("Titanic", Duration.ofHours(2)).build();
	    Sessao sessao2 = SessaoBuilder.noHorario(LocalTime.of(21, 00)).comFilme("Harry Potter", Duration.ofHours(2)).build();	 
	    Sala sala = new Sala("30");
	    sala.add(sessao1);	    
	    sala.add(sessao2);
	    Assert.assertTrue("A lista deve ser maior que 0!", sala.getSize() > 0);
	}
	
	
	@Test(expected=RuntimeException.class)
	public void testeSessaoComecaAntesTerminaNoMeio() {
		Sessao sessao1 = SessaoBuilder.noHorario(LocalTime.of(18, 00)).comFilme("Titanic", Duration.ofHours(2)).build();
	    Sessao sessao2 = SessaoBuilder.noHorario(LocalTime.of(17, 00)).comFilme("Harry Potter", Duration.ofHours(2)).build();	 
	    Sala sala = new Sala("30");
	    sala.add(sessao1);
	    sala.add(sessao2);
	    Assert.assertTrue("A lista deve ser maior que 0!", sala.getSize() == 1);
	}
	
	@Test(expected=RuntimeException.class)
	public void testeSessaoComecaNoMeioTerminaDepois() {
		Sessao sessao1 = SessaoBuilder.noHorario(LocalTime.of(18, 00)).comFilme("Titanic", Duration.ofHours(2)).build();
	    Sessao sessao2 = SessaoBuilder.noHorario(LocalTime.of(19, 00)).comFilme("Harry Potter", Duration.ofHours(2)).build();	 
	    Sala sala = new Sala("30");
	    sala.add(sessao1);
	    sala.add(sessao2);
	    Assert.assertTrue("A lista deve ser maior que 0!", sala.getSize() > 0);
	}
	
	@Test(expected=RuntimeException.class)
	public void testeSessaoComecaNoMeioETerminaNoMeio() {
		Sessao sessao1 = SessaoBuilder.noHorario(LocalTime.of(18, 00)).comFilme("Titanic", Duration.ofHours(2)).build();
	    Sessao sessao2 = SessaoBuilder.noHorario(LocalTime.of(18, 30)).comFilme("Harry Potter", Duration.ofHours(1)).build();	
	    Sala sala = new Sala("30");
	    sala.add(sessao1);
	    sala.add(sessao2);
	    Assert.assertTrue("A lista deve ser maior que 0!", sala.getSize() > 0);
	}
	
	@Test
	public void testSessacaoComecaDepoisETerminaDepois() {
		Sessao sessao1 = SessaoBuilder.noHorario(LocalTime.of(18, 00)).comFilme("Titanic", Duration.ofHours(2)).build();
	    Sessao sessao2 = SessaoBuilder.noHorario(LocalTime.of(21, 30)).comFilme("Harry Potter", Duration.ofHours(1)).build();	
	    Sala sala = new Sala("30");
	    sala.add(sessao1);	    
	    sala.add(sessao2);	    
	    Assert.assertTrue("A lista deve ser maior que 0!", sala.getSize() > 0);
	}
	
	
	

}
